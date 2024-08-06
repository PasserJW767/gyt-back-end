package com.gyt.gytApi.mapper;

import com.gyt.gytApi.domain.HealthPostpartumDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
public interface HealthPostpartumMapper {

    public HealthPostpartumDTO selectHealthPostpartum(Integer id);
}
