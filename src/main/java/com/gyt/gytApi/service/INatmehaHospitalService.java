package com.gyt.gytApi.service;

import com.github.pagehelper.Page;
import com.gyt.gytApi.domain.NatmehaHospitalDTO;

import java.util.List;

public interface INatmehaHospitalService {

    //natmehaHospital/getTheFirstTwoHos,拿到评分最高的两个医院的信息
    public Page<NatmehaHospitalDTO> getTheFirstTwoHos();

    // 根据国医堂itemCode查询此医院详情（相关电话、地址等信息）
    public Page<NatmehaHospitalDTO> getHosDetailIndexInfoByHosItemCode(String itemCode);

    //  获取医院的总数
    Integer getHospitalListCount(String keyword);

    //  根据页的大小获得列表
    Page<NatmehaHospitalDTO> getHospitalListByPageSize(String keyword,int pageNum);
    List<NatmehaHospitalDTO> selectNearByHospitalToTreat(NatmehaHospitalDTO natmehaHospitalDTO);
}
