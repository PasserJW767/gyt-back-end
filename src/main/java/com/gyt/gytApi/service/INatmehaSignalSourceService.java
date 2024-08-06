package com.gyt.gytApi.service;

import com.gyt.gytApi.domain.NatmehaSignalSourceDTO;

import java.util.Date;
import java.util.List;

public interface INatmehaSignalSourceService {

//    根据所给的医生Doctor_Code和所给的时间，来查询这名医生当天的号
    NatmehaSignalSourceDTO selectDoctorSignalSource(String doctorCode, Date startTime,Date endTime);

//    根据所给的医生Doctor_Code和所给的时间,来查询这名医生当天预约量最小的一个号
    NatmehaSignalSourceDTO selectDoctorNewlySignal(String doctorCode,Date startTime,Date endTime);

//    根据号源表和register_ref表获取下一个号
    Integer selectNextNo(String doctorCode,Date startTime,Date endTime);

//    获取这个医院当天值班的医生列表
    List<NatmehaSignalSourceDTO> selectTodayInWorkDoctorList(String hospitalCode,Date startTime,Date endTime);
}
