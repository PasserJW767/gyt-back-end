package com.gyt.gytApi.service.impl;

import com.gyt.gytApi.domain.NatmehaInteTreatDTO;
import com.gyt.gytApi.mapper.NatmehaInteTreatMapper;
import com.gyt.gytApi.service.INatmehaInteTreatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*智能导诊*/
@Service
public class NatmehaIneTreatServiceImp implements INatmehaInteTreatService {


    @Autowired
    NatmehaInteTreatMapper natmehaInteTreatMapper;

    /*智能导诊：选择性插入*/
    public int insertSelectiveInteTreat(NatmehaInteTreatDTO natmehaInteTreatDTO){
        return natmehaInteTreatMapper.insertSelectiveInteTreat(natmehaInteTreatDTO);

    }
}
