package com.gyt.gytApi.service;

import com.gyt.gytApi.domain.TKQuestionDTO;

import java.util.List;

public interface ITKQuestionService {
    int deleteByPrimaryKey(String qId);

    int insert(TKQuestionDTO record);

    int insertSelective(TKQuestionDTO record);

    List<TKQuestionDTO> select();

    int updateByPrimaryKeySelective(TKQuestionDTO record);

    int updateByPrimaryKey(TKQuestionDTO record);
}