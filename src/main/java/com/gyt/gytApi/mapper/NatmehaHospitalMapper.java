package com.gyt.gytApi.mapper;

import com.github.pagehelper.Page;
import com.gyt.gytApi.domain.NatmehaHospitalDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @Entity generator.domain.NatmehaHospital
*/
@Mapper
public interface NatmehaHospitalMapper{

    //natmehaHospital/getTheFirstTwoHos,拿到评分最高的两个医院的信息
    public Page<NatmehaHospitalDTO> getTheFirstTwoHos();

    // 根据国医堂itemCode查询此医院详情（相关电话、地址等信息）
    public Page<NatmehaHospitalDTO> getHosDetailIndexInfoByHosItemCode(String  itemCode);

    //    获取医院的总数
    Integer getHospitalListCount(@Param("keyword")String keyword);

    List<NatmehaHospitalDTO> selectNearByHospitalToTreat(NatmehaHospitalDTO natmehaHospitalDTO);

    //  根据页的大小获得列表
    Page<NatmehaHospitalDTO> getHospitalListByPageSize(@Param("keyword")String keyword,@Param("pageNum") int pageNum,@Param("pageSize") int pageSize);
}
