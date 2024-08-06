package com.gyt.gytApi.service.impl;

import com.gyt.gytApi.domain.HealthRecordsDTO;
import com.gyt.gytApi.mapper.HealthRecordsMapper;
import com.gyt.gytApi.service.IHealthRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("healthRecordsService")
@Transactional(propagation = Propagation.SUPPORTS,rollbackFor = Exception.class)
public class HealthRecordsServiceImpl implements IHealthRecordsService {

    @Autowired
    HealthRecordsMapper healthRecordsMapper;

    @Override
    public HealthRecordsDTO selectHealthRecords(Integer id) {
        return this.healthRecordsMapper.selectHealthRecords(id);
    }
}
