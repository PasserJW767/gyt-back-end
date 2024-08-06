package com.gyt.gytApi.mapper;

import com.gyt.gytApi.domain.HealthHyperDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
public interface HealthHyperMapper {

    public HealthHyperDTO selectHealthHyper(Integer id);
}
