package com.gyt.gytApi.service;

import org.apache.ibatis.annotations.Param;

public interface INatmehaRegisterRefService {
//    根据医生号源sourceCode选择出当天预约的最大数值
    Integer selectTodayMaxRegisterNumBySourceCode(String sourceCode);
//    插入挂号信息
    int insertSignalSource(String sourceCode,Integer registerNum,String patientCode,String userCode);
}
