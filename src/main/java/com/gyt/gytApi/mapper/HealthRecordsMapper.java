package com.gyt.gytApi.mapper;

import com.gyt.gytApi.domain.HealthRecordsDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
public interface HealthRecordsMapper {

    public HealthRecordsDTO selectHealthRecords(Integer id);
}
