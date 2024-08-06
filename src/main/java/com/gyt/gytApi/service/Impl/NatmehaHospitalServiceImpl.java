package com.gyt.gytApi.service.impl;

import com.github.pagehelper.Page;
import com.gyt.gytApi.domain.NatmehaHospitalDTO;
import com.gyt.gytApi.mapper.NatmehaHospitalMapper;
import com.gyt.gytApi.mapper.NatmehaSignalSourceMapper;
import com.gyt.gytApi.service.INatmehaHospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class NatmehaHospitalServiceImpl implements INatmehaHospitalService {
    @Autowired
    NatmehaHospitalMapper natmehaHospitalMapper;
    @Autowired
    NatmehaSignalSourceMapper natmehaSignalSourceMapper;

    //natmehaHospital/getTheFirstTwoHos,拿到评分最高的两个医院的信息
    @Override
    public Page<NatmehaHospitalDTO> getTheFirstTwoHos() {
        return this.natmehaHospitalMapper.getTheFirstTwoHos();
    }

    // 根据国医堂itemCode查询此医院详情（相关电话、地址等信息）
    @Override
    public Page<NatmehaHospitalDTO> getHosDetailIndexInfoByHosItemCode(String itemCode) {
        return this.natmehaHospitalMapper.getHosDetailIndexInfoByHosItemCode(itemCode);
    }

    @Override
    public Integer getHospitalListCount(String keyword) {
        return natmehaHospitalMapper.getHospitalListCount(keyword);
    }

    @Override
    public Page<NatmehaHospitalDTO> getHospitalListByPageSize(String keyword, int pageNum) {
        Page<NatmehaHospitalDTO> hospitalListByPageSize = null;
        hospitalListByPageSize = natmehaHospitalMapper.getHospitalListByPageSize(keyword, pageNum, 1);
        for (NatmehaHospitalDTO natmehaHospitalDTO : hospitalListByPageSize) {
            int surplus = 30 - natmehaSignalSourceMapper.todayNum(natmehaHospitalDTO.getItemid());
            natmehaHospitalDTO.setSurplus(surplus);
        }
        return hospitalListByPageSize;

    }
    @Override
    public List<NatmehaHospitalDTO> selectNearByHospitalToTreat(NatmehaHospitalDTO natmehaHospitalDTO) {
        return natmehaHospitalMapper.selectNearByHospitalToTreat(natmehaHospitalDTO);
    }
}
