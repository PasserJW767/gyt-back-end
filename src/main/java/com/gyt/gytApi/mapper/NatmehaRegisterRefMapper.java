package com.gyt.gytApi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface NatmehaRegisterRefMapper {

//    根据医生号源sourceCode选择出当天预约的最大数值
    Integer selectTodayMaxRegisterNumBySourceCode(String sourceCode);
//    插入挂号信息
    void insertSignalSource(
            @Param("itemCode") String itemCode,
            @Param("sourceCode") String sourceCode,
            @Param("registerNum") Integer registerNum,
            @Param("patientCode") String patientCode,
            @Param("userCode") String userCode);
}