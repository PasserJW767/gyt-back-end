package com.gyt.gytApi.mapper;

import com.gyt.gytApi.domain.TKQuestionDTO;

import java.util.List;

public interface TKQuestionMapper {
    int deleteByPrimaryKey(String qId);

    int insert(TKQuestionDTO record);

    int insertSelective(TKQuestionDTO record);

    List<TKQuestionDTO> select();

    int updateByPrimaryKeySelective(TKQuestionDTO record);

    int updateByPrimaryKey(TKQuestionDTO record);
}