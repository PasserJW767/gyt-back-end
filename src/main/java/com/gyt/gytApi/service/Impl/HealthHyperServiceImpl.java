package com.gyt.gytApi.service.impl;

import com.gyt.gytApi.domain.HealthHyperDTO;
import com.gyt.gytApi.mapper.HealthHyperMapper;
import com.gyt.gytApi.service.IHealthHyperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("healthHyperService")
@Transactional(propagation = Propagation.SUPPORTS,rollbackFor = Exception.class)
public class HealthHyperServiceImpl implements IHealthHyperService {

    @Autowired
    HealthHyperMapper healthHyperMapper;

    @Override
    public HealthHyperDTO selectHealthHyper(Integer id) {
        return this.healthHyperMapper.selectHealthHyper(id);
    }
}
