package com.gyt.gytApi.service.impl;

import com.gyt.gytApi.domain.HealthBaseDTO;
import com.gyt.gytApi.mapper.HealthBaseMapper;
import com.gyt.gytApi.service.IHealthBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("healthBaseService")
@Transactional(propagation = Propagation.SUPPORTS,rollbackFor = Exception.class)
public class HealthBaseServiceImpl implements IHealthBaseService {

    @Autowired
    HealthBaseMapper healthBaseMapper;

    @Override
    public HealthBaseDTO selectHealthBase(Integer id) {
        return this.healthBaseMapper.selectHealthBase(id);
    }
}
