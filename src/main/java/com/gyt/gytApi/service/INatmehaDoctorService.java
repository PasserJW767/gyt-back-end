package com.gyt.gytApi.service;

import com.github.pagehelper.Page;
import com.gyt.gytApi.domain.NatmehaDoctorDTO;

import java.util.Date;
import java.util.List;

public interface INatmehaDoctorService {

    //查医院服务团队
    public Page<NatmehaDoctorDTO> getHosDetailServiceTeam(String hosItemCode);

//    根据医院的itemId选择出今天上班的医生列表
    List<NatmehaDoctorDTO> selectDoctorListByHospital(String hospitalItemCode, Date now, Date end);

//    根据医生的itemId和itemCode来选择出这位医生
    NatmehaDoctorDTO selectDoctorInfoForConfirm(Integer itemId,String itemCode);

}
