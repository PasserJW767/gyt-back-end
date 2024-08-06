package com.gyt.gytApi.service.impl;

import com.gyt.gytApi.domain.HealthChildrenDTO;
import com.gyt.gytApi.mapper.HealthChildrenMapper;
import com.gyt.gytApi.service.IHealthChildrenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("healthChildrenService")
@Transactional(propagation = Propagation.SUPPORTS,rollbackFor = Exception.class)
public class HealthChildrenServiceImpl implements IHealthChildrenService {

    @Autowired
    HealthChildrenMapper healthChildrenMapper;

    @Override
    public HealthChildrenDTO selectHealthChildren(Integer id) {
        return this.healthChildrenMapper.selectHealthChildren(id);
    }
}