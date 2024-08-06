package com.gyt.gytApi.service;

import com.gyt.gytApi.domain.NatmehaPatientDTO;

import java.util.List;

public interface INatmehaPatientService {

//    根据userCode选择其下的就诊人列表
    List<NatmehaPatientDTO> selectPatientInfoByUserCode(String userCode);
}
