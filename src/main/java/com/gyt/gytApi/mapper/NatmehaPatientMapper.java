package com.gyt.gytApi.mapper;

import com.gyt.gytApi.domain.NatmehaPatientDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NatmehaPatientMapper {

//    根据userCode选择其下的就诊人列表
    List<NatmehaPatientDTO> selectPatientInfoByUserCode(String userCode);
}