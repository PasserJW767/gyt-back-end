package com.gyt.gytApi.mapper;

import com.gyt.gytApi.domain.TKTypeDTO;

public interface TKTypeMapper {
    int deleteByPrimaryKey(String typeId);

    int insert(TKTypeDTO record);

    int insertSelective(TKTypeDTO record);

    TKTypeDTO selectByPrimaryKey(String typeId);

    int updateByPrimaryKeySelective(TKTypeDTO record);

    int updateByPrimaryKey(TKTypeDTO record);
}