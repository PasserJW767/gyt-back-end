package com.gyt.gytApi.service.impl;

import com.gyt.gytApi.mapper.NatmehaRegisterRefMapper;
import com.gyt.gytApi.service.INatmehaRegisterRefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service("natmehaRegisterRefService")
public class NatmehaRegisterRefServiceImpl implements INatmehaRegisterRefService {

    @Autowired
    NatmehaRegisterRefMapper natmehaRegisterRefMapper;

    @Override
    public Integer selectTodayMaxRegisterNumBySourceCode(String sourceCode) {
        return natmehaRegisterRefMapper.selectTodayMaxRegisterNumBySourceCode(sourceCode);
    }

    @Override
    public int insertSignalSource(String sourceCode, Integer registerNum, String patientCode, String userCode) {
        String itemCode = UUID.randomUUID().toString().replaceAll("-","");
        natmehaRegisterRefMapper.insertSignalSource(itemCode, sourceCode, registerNum, patientCode, userCode);
        return 1;
    }
}
