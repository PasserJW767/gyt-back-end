package com.gyt.gytApi.service.impl;

import com.gyt.gytApi.domain.HealthDiabetesDTO;
import com.gyt.gytApi.mapper.HealthDiabetesMapper;
import com.gyt.gytApi.service.IHealthDiabetesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("healthDiabetesService")
@Transactional(propagation = Propagation.SUPPORTS,rollbackFor = Exception.class)
public class HealthDiabetesServiceImpl implements IHealthDiabetesService {

    @Autowired
    HealthDiabetesMapper healthDiabetesMapper;

    @Override
    public HealthDiabetesDTO selectHealthDiabetes(Integer id) {
        return this.healthDiabetesMapper.selectHealthDiabetes(id);
    }
}
