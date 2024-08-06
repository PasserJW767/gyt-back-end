package com.gyt.gytApi.service;

import com.gyt.gytApi.domain.NatmehaInteTreatDTO;

/*智能导诊*/
public interface INatmehaInteTreatService {
    /*智能导诊：选择性插入*/
    int insertSelectiveInteTreat(NatmehaInteTreatDTO natmehaInteTreatDTO);
}
