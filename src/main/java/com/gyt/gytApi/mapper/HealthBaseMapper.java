package com.gyt.gytApi.mapper;

import com.gyt.gytApi.domain.HealthBaseDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
public interface HealthBaseMapper {

    public HealthBaseDTO selectHealthBase(Integer id);
}
