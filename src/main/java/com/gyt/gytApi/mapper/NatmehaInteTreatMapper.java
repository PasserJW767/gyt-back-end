package com.gyt.gytApi.mapper;

import com.gyt.gytApi.domain.NatmehaInteTreatDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NatmehaInteTreatMapper {
    /*智能导诊：选择性插入*/
    int insertSelectiveInteTreat(NatmehaInteTreatDTO natmehaInteTreatDTO);
}