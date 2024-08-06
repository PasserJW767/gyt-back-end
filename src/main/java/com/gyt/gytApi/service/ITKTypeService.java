package com.gyt.gytApi.service;

import com.gyt.gytApi.domain.TKTypeDTO;

public interface ITKTypeService {
    int deleteByPrimaryKey(String typeId);

    int insert(TKTypeDTO record);

    int insertSelective(TKTypeDTO record);

    TKTypeDTO selectByPrimaryKey(String typeId);

    int updateByPrimaryKeySelective(TKTypeDTO record);

    int updateByPrimaryKey(TKTypeDTO record);
}