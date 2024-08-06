package com.gyt.gytApi.controller;

import com.github.pagehelper.Page;
import com.gyt.gytApi.domain.NatmehaDoctorDTO;
import com.gyt.gytApi.domain.NatmehaHospitalDTO;
import com.gyt.gytApi.domain.NatmehaPatientDTO;
import com.gyt.gytApi.domain.NatmehaSignalSourceDTO;
import com.gyt.gytApi.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping("/Appointment")
public class AppointmentController {

    @Autowired
    INatmehaHospitalService natmehaHospitalService;

    @Autowired
    INatmehaDoctorService natmehaDoctorService;

    @Autowired
    INatmehaSignalSourceService natmehaSignalSourceService;

    @Autowired
    INatmehaPatientService natmehaPatientService;

    @Autowired
    INatmehaRegisterRefService natmehaRegisterRefService;

    @GetMapping("/getHospitalListCount")
    @CrossOrigin
    @ResponseBody
    public Integer getHospitalListCount(String keyWord) {
        return natmehaHospitalService.getHospitalListCount(keyWord);
    }

    /**
     * 从其中获取医院数据列表
     * @param keyWord  用户给出的关键字
     * @return
     */
    @GetMapping("/getHospitalList")
    @CrossOrigin
    @ResponseBody
    public Page<NatmehaHospitalDTO> getHospitalListByPageSize(String keyWord, int pageNum) {
        Page<NatmehaHospitalDTO> hospitalListByPageSize = natmehaHospitalService.getHospitalListByPageSize(keyWord, pageNum);
//        获得当天时间
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 00);
        calendar.set(Calendar.MINUTE, 00);
        calendar.set(Calendar.SECOND, 00);
        calendar.set(Calendar.MILLISECOND, 0);
        Date startTime = calendar.getTime();
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 0);
        Date endTime = calendar.getTime();
//        根据医院ID选出当天值班的号源表
        List<NatmehaSignalSourceDTO> natmehaSignalSourceDTOS = natmehaSignalSourceService.selectTodayInWorkDoctorList(hospitalListByPageSize.get(0).getItemcode(), startTime, endTime);
//        定义剩余量变量为0
        int surplus = 0;
        for (NatmehaSignalSourceDTO natmehaSignalSourceDTO : natmehaSignalSourceDTOS) {
            Integer todayBookNum = natmehaRegisterRefService.selectTodayMaxRegisterNumBySourceCode(natmehaSignalSourceDTO.getItemcode());
            int tempSurplus = natmehaSignalSourceDTO.getRegisterCount() - todayBookNum;
            surplus += tempSurplus;
        }
        hospitalListByPageSize.get(0).setSurplus(surplus);
        return hospitalListByPageSize;
    }

    /**
     * 根据传入的itemCode和dateStr选出当天值班的医生列表
     *
     * @param itemCode 医院的itemCode
     * @param dateStr  用户选择日期的date字符串
     * @return
     */
    @GetMapping("/getWorkDoctorListByHospital")
    @CrossOrigin
    @ResponseBody
    public List<Map> getWorkDoctorListByHospital(String itemCode, String dateStr) {
//        将获得的日期字符串转换为Date类型
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date transDate = null;
        try {
            transDate = sdf.parse(dateStr);
        } catch (ParseException e) {
            System.err.println("获取医生列表时日期转换错误：" + e.getMessage());
        }
//        如果传入的日期 == 当天日期，就将传入日期的时间改为当前时间
        // 创造当前日期
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 00);
        calendar.set(Calendar.MINUTE, 00);
        calendar.set(Calendar.SECOND, 00);
        calendar.set(Calendar.MILLISECOND, 0);
        Date startDate = calendar.getTime();
        // 比较传入日期与当前日期,如果日期相同，就将开始日期设为当前时期，不相等则保持那一天00:00:00
        if (transDate.getTime() == startDate.getTime()) {
            transDate = new Date();
        }
//        获取传入日期当天的23:59:59
        calendar.setTime(transDate);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 0);
        Date endDate = calendar.getTime();
//        根据医院的itemId选择出今天上班的医生列表
        List<NatmehaDoctorDTO> natmehaDoctorDTOS = natmehaDoctorService.selectDoctorListByHospital(itemCode, transDate, endDate);
//        根据当天上班的医生列表向Map中放入剩余的数据
        // 创建一个新map
        List<Map> list = new ArrayList<>();
        for (NatmehaDoctorDTO natmehaDoctorDTO : natmehaDoctorDTOS) {
            NatmehaSignalSourceDTO natmehaSignalSourceDTO = natmehaSignalSourceService.selectDoctorSignalSource(natmehaDoctorDTO.getItemcode(), transDate, endDate);
//            存放工作时间（上午、下午、晚上）
            int[] array = new int[2];
            array[0] = 0;
            array[1] = 0;
//            查出该医生的工作时段
            Calendar tempCalender = Calendar.getInstance();
            tempCalender.setTime(natmehaSignalSourceDTO.getRegisterDate());
            int hour = tempCalender.get(Calendar.HOUR_OF_DAY);
            if (hour <= 14) {
                array[0] = 1;
            } else if (hour > 14) {
                array[1] = 1;
            }
//            将工作时段字符串存入到workTime中
            StringBuilder workTime = new StringBuilder();
            if (array[0] == 1)
                workTime.append("上午");
            if (array[0] == 1 && array[1] == 1)
                workTime.append(",");
            if (array[1] == 1)
                workTime.append("下午");
//            存放该医生号源
            int num = 0;
            //获得该医生的最大号源
            Integer maxNum = natmehaRegisterRefService.selectTodayMaxRegisterNumBySourceCode(natmehaSignalSourceDTO.getItemcode());
            if (maxNum == null) {
                maxNum = 0;
            }
            num = natmehaSignalSourceDTO.getRegisterCount() - maxNum;
            List<String> tempList = new ArrayList<>();
            tempList.add(workTime.toString());
            tempList.add(String.valueOf(num));
            Map map = new HashMap<>();
            map.put("doctorInfo", natmehaDoctorDTO);
            map.put("signalInfo", tempList);
            list.add(map);
        }
        return list;
    }

    @GetMapping("/getDoctorInfoForConfirm")
    @CrossOrigin
    @ResponseBody
    public NatmehaDoctorDTO getDoctorInfoForConfirm(Integer itemId, String itemCode) {
        return natmehaDoctorService.selectDoctorInfoForConfirm(itemId, itemCode);
    }

    @GetMapping("/getPatientInfoByUserCode")
    @CrossOrigin
    @ResponseBody
    public List<NatmehaPatientDTO> getPatientInfoByUserCode(String userCode) {
        return natmehaPatientService.selectPatientInfoByUserCode(userCode);
    }

    @GetMapping("/getDoctorNewlySignal")
    @CrossOrigin
    @ResponseBody
    public NatmehaSignalSourceDTO getDoctorNewlySignal(String doctorCode, String dateStr) {
//        将获得的日期字符串转换为Date类型
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date transDate = null;
        try {
            transDate = sdf.parse(dateStr);
        } catch (ParseException e) {
            System.err.println("获取医生列表时日期转换错误：" + e.getMessage());
        }
//        如果传入的日期 == 当天日期，就将传入日期的时间改为当前时间
        // 创造当前日期
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 00);
        calendar.set(Calendar.MINUTE, 00);
        calendar.set(Calendar.SECOND, 00);
        calendar.set(Calendar.MILLISECOND, 0);
        Date startDate = calendar.getTime();
        // 比较传入日期与当前日期,如果日期相同，就将开始日期设为当前时期，不相等则保持那一天00:00:00
        if (transDate.getTime() == startDate.getTime()) {
            transDate = new Date();
        }
//        获取传入日期当天的23:59:59
        calendar.setTime(transDate);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 0);
        Date endDate = calendar.getTime();
//        获取到这个号源
        NatmehaSignalSourceDTO natmehaSignalSourceDTO = natmehaSignalSourceService.selectDoctorNewlySignal(doctorCode, transDate, endDate);
//        获取到下一个排号值
        Integer num = natmehaSignalSourceService.selectNextNo(doctorCode, transDate, endDate);
        natmehaSignalSourceDTO.setRegisterCount(num+1);
        return natmehaSignalSourceDTO;

    }

    @GetMapping("/insertSignalSource")
    @CrossOrigin
    @ResponseBody
    public Integer insertSignalSource(String sourceCode,String registerNum,String patientCode,String userCode) {
        Integer rn = Integer.valueOf(registerNum);
        return natmehaRegisterRefService.insertSignalSource(sourceCode, rn, patientCode, userCode);
    }
}
