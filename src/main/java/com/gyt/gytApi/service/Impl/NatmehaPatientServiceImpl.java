package com.gyt.gytApi.service.impl;

import com.gyt.gytApi.domain.NatmehaPatientDTO;
import com.gyt.gytApi.mapper.NatmehaPatientMapper;
import com.gyt.gytApi.service.INatmehaPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("NatmehaPatientService")
public class NatmehaPatientServiceImpl implements INatmehaPatientService {

    @Autowired
    NatmehaPatientMapper natmehaPatientMapper;

    @Override
    public List<NatmehaPatientDTO> selectPatientInfoByUserCode(String userCode) {
        return natmehaPatientMapper.selectPatientInfoByUserCode(userCode);
    }


}
