package com.gyt.gytApi.service.impl;


import com.gyt.gytApi.domain.TKQuestionDTO;
import com.gyt.gytApi.mapper.TKQuestionMapper;
import com.gyt.gytApi.service.ITKQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("tKTypeService")
@Transactional(propagation = Propagation.SUPPORTS,rollbackFor = Exception.class)
public class TKQuestionServiceImpl implements ITKQuestionService {
    @Autowired
    TKQuestionMapper tkQuestionMapper;


    @Override
    public int deleteByPrimaryKey(String qId) {
        return 0;
    }

    @Override
    public int insert(TKQuestionDTO record) {
        return 0;
    }

    @Override
    public int insertSelective(TKQuestionDTO record) {
        return 0;
    }

    @Override
    public List<TKQuestionDTO> select() {
        return this.tkQuestionMapper.select();
    }

    @Override
    public int updateByPrimaryKeySelective(TKQuestionDTO record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TKQuestionDTO record) {
        return 0;
    }
}
