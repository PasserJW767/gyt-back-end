package com.gyt.gytApi.controller;

import com.github.pagehelper.Page;
import com.gyt.gytApi.domain.NatmehaDoctorDTO;
import com.gyt.gytApi.domain.NatmehaHospitalDTO;
import com.gyt.gytApi.domain.NatmehaProjectDTO;
import com.gyt.gytApi.domain.NatmehaSignalSourceDTO;
import com.gyt.gytApi.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import com.gyt.gytApi.service.INatmehaHospitalService;


@RestController
@RequestMapping("/natmehaHospital")
public class NatmehaHospitalController {
    @Autowired
    INatmehaHospitalService natmehaHospitalService;
    @Autowired
    INatmehaProjectService INatmehaProjectService;
    @Autowired
    INatmehaDoctorService natmehaDoctorService;
    @Autowired
    INatmehaSignalSourceService natmehaSignalSourceService;
    @Autowired
    INatmehaRegisterRefService natmehaRegisterRefService;
    @GetMapping("/getTheFirstTwoHos")
    @CrossOrigin
    @ResponseBody
    public Page<NatmehaHospitalDTO> getTheFirstTwoHos(){
        return this.natmehaHospitalService.getTheFirstTwoHos();
    }

    @GetMapping("/getHosDetailIndexInfoByHosItemCode")
    @CrossOrigin
    @ResponseBody
    public Page<NatmehaHospitalDTO> getHosDetailIndexInfoByHosItemCode(@RequestParam("itemCode") String itemCode){
        return this.natmehaHospitalService.getHosDetailIndexInfoByHosItemCode(itemCode);
    }

    @GetMapping("/getHosDetailLaunchProjects")
    @CrossOrigin
    @ResponseBody
    public Page<NatmehaProjectDTO> getHosDetailLaunchProjects(@RequestParam("hosItemCode") String hosItemCode){
        return this.INatmehaProjectService.getHosDetailLaunchProjects(hosItemCode);
    }

    @GetMapping("/getHosDetailCharacteristic")
    @CrossOrigin
    @ResponseBody
    public Page<NatmehaProjectDTO> getHosDetailCharacteristic(@RequestParam("hosItemCode") String hosItemCode){
        return this.INatmehaProjectService.getHosDetailCharacteristic(hosItemCode);
    }

    @GetMapping("/getHosDetailServiceTeam")
    @CrossOrigin
    @ResponseBody
    public Page<NatmehaDoctorDTO> getHosDetailServiceTeam(@RequestParam("hosItemCode") String hosItemCode){
        return this.natmehaDoctorService.getHosDetailServiceTeam(hosItemCode);
    }

    //    用于获得医院的总数
    @GetMapping("/getHospitalListCount")
    @CrossOrigin
    @ResponseBody
    public Integer getHospitalListCount(String keyWord) {
        return natmehaHospitalService.getHospitalListCount(keyWord);
    }

    /**
     * 从其中获取医院数据列表
     * @param keyWord 根据什么排序的标志
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
     * 智能导诊：附近医院
     * @param hospitalCity
     * @param hospitalPro
     * @return
     */
    @GetMapping("/selectNearBy")
    public List<NatmehaHospitalDTO> selectNearByHospitalToTreat(@RequestParam(required = false) String hospitalCity,
                                                                @RequestParam(required = false) String hospitalPro){
        NatmehaHospitalDTO natmehaHospitalDTO = new NatmehaHospitalDTO();
        if(hospitalCity!=null){
            natmehaHospitalDTO.setHospitalCity(hospitalCity);
        }
        if(hospitalPro!=null){
            natmehaHospitalDTO.setHospitalPro(hospitalPro);
        }
        List<NatmehaHospitalDTO> natmehaHospitalDTOS = natmehaHospitalService.selectNearByHospitalToTreat(natmehaHospitalDTO);
       /* if (natmehaHospitalDTOS.size()<3) {
            natmehaHospitalDTO.setHospitalCity(null);
            natmehaHospitalDTO.setHospitalPro(hospitalPro);
            natmehaHospitalDTOS = natmehaHospitalService.selectNearByHospitalToTreat(natmehaHospitalDTO);
        }*/
        return natmehaHospitalDTOS;
    }
}
