package com.gyt.gytApi.mapper;


import com.gyt.gytApi.domain.NatmehaSignalSourceDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
* @Entity com.gyt.gytApi.domain.NatmehaSignalSourceDTO
*/
@Mapper
public interface NatmehaSignalSourceMapper{

    int todayNum(int itemCode);

    //    根据所给的医生Doctor_Code和所给的时间，来查询这名医生当天的号
    NatmehaSignalSourceDTO selectDoctorSignalSource(
            @Param("doctorCode")String doctorCode,
            @Param("startTime") Date startTime,
            @Param("endTime")Date endTime);

    //    根据所给的医生Doctor_Code和所给的时间,来查询这名医生当天预约量最小的一个号
    NatmehaSignalSourceDTO selectDoctorNewlySignal(
            @Param("doctorCode")String doctorCode,
            @Param("startTime") Date startTime,
            @Param("endTime")Date endTime);

    //    根据号源表和register_ref表获取下一个号
    Integer selectNextNo(
            @Param("doctorCode")String doctorCode,
            @Param("startTime") Date startTime,
            @Param("endTime")Date endTime);

    //    获取这个医院当天值班的医生列表
    List<NatmehaSignalSourceDTO> selectTodayInWorkDoctorList(
            @Param("hospitalCode")String hospitalCode,
            @Param("startTime") Date startTime,
            @Param("endTime")Date endTime);

}
