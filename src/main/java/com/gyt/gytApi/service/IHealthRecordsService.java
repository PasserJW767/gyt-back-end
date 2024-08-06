package com.gyt.gytApi.service;

import com.gyt.gytApi.domain.HealthRecordsDTO;

public interface IHealthRecordsService {

    public HealthRecordsDTO selectHealthRecords(Integer id);
}
