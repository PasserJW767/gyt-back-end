package com.gyt.gytApi.service.impl;


import com.github.pagehelper.Page;
import com.gyt.gytApi.domain.NatmehaDoctorDTO;
import com.gyt.gytApi.mapper.NatmehaDoctorMapper;
import com.gyt.gytApi.service.INatmehaDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
*
*/
@Service
public class NatmehaDoctorServiceImpl implements INatmehaDoctorService {

    @Autowired
    NatmehaDoctorMapper natmehaDoctorMapper;

    @Override
    //查医院服务团队
    public Page<NatmehaDoctorDTO> getHosDetailServiceTeam(String hosItemCode){
        return this.natmehaDoctorMapper.getHosDetailServiceTeam(hosItemCode);
    }

    /**
     * 根据医院的itemId选择出今天上班的医生列表
     * @param hospitalItemCode 医院的ID
     * @param now 当天的起始时间
     * @param end 当天的结束时间
     * @return
     */
    @Override
    public List<NatmehaDoctorDTO> selectDoctorListByHospital(String hospitalItemCode, Date now, Date end) {
        return natmehaDoctorMapper.selectDoctorListByHospital(hospitalItemCode,now,end);
    }

    /**
     * 根据医生的itemId和itemCode来选择出这位医生
     * @param itemId  医生的itemId
     * @param itemCode  医生的itemCode
     * @return
     */
    @Override
    public NatmehaDoctorDTO selectDoctorInfoForConfirm(Integer itemId, String itemCode) {
        return natmehaDoctorMapper.selectDoctorInfoForConfirm(itemId, itemCode);
    }

}
