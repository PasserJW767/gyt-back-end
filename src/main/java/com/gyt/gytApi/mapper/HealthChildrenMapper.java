package com.gyt.gytApi.mapper;

import com.gyt.gytApi.domain.HealthChildrenDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
public interface HealthChildrenMapper {

    public HealthChildrenDTO selectHealthChildren(Integer id);
}
