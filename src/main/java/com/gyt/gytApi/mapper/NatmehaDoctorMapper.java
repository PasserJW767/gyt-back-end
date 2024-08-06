package com.gyt.gytApi.mapper;


import com.github.pagehelper.Page;
import com.gyt.gytApi.domain.NatmehaDoctorDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface NatmehaDoctorMapper{

    //查医院服务团队
    public Page<NatmehaDoctorDTO> getHosDetailServiceTeam(String hosItemCode);
    //    根据医院的itemId选择出今天上班的医生列表
    List<NatmehaDoctorDTO> selectDoctorListByHospital(
            @Param("hospitalItemCode")String hospitalItemCode,
            @Param("startTime") Date startTime,
            @Param("endTime") Date endTime);

    //    根据医生的itemId和itemCode来选择出这位医生
    NatmehaDoctorDTO selectDoctorInfoForConfirm(
            @Param("itemId") Integer itemId,
            @Param("itemCode") String itemCode);
}