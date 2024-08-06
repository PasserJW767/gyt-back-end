package com.gyt.gytApi.service.impl;

import com.gyt.gytApi.domain.HealthPostpartumDTO;
import com.gyt.gytApi.mapper.HealthPostpartumMapper;
import com.gyt.gytApi.service.IHealthPostpartumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("healthPostpartumService")
@Transactional(propagation = Propagation.SUPPORTS,rollbackFor = Exception.class)
public class HealthPostpartumServiceImpl implements IHealthPostpartumService {

    @Autowired
    HealthPostpartumMapper healthPostpartumMapper;

    @Override
    public HealthPostpartumDTO selectHealthPostpartum(Integer id) {
        return this.healthPostpartumMapper.selectHealthPostpartum(id);
    }
}
