package com.gyt.gytApi.mapper;

import com.gyt.gytApi.domain.HealthDiabetesDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
public interface HealthDiabetesMapper {

    public HealthDiabetesDTO selectHealthDiabetes(Integer id);
}
