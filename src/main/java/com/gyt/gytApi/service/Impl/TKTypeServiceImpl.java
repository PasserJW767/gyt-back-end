package com.gyt.gytApi.service.impl;

import com.gyt.gytApi.domain.TKTypeDTO;
import com.gyt.gytApi.mapper.TKTypeMapper;
import com.gyt.gytApi.service.ITKTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service("tKQuestionService")
@Transactional(propagation = Propagation.SUPPORTS,rollbackFor = Exception.class)
public class TKTypeServiceImpl implements ITKTypeService {

    @Autowired
    TKTypeMapper tkTypeMapper;

    @Override
    public int deleteByPrimaryKey(String typeId) {
        return 0;
    }

    @Override
    public int insert(TKTypeDTO record) {
        return 0;
    }

    @Override
    public int insertSelective(TKTypeDTO record) {
        return 0;
    }

    @Override
    public TKTypeDTO selectByPrimaryKey(String typeId) {
        return this.tkTypeMapper.selectByPrimaryKey(typeId);
    }

    @Override
    public int updateByPrimaryKeySelective(TKTypeDTO record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TKTypeDTO record) {
        return 0;
    }
}
