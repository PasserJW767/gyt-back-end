package com.gyt.gytApi.service.impl;

import com.gyt.gytApi.domain.NatmehaSignalSourceDTO;
import com.gyt.gytApi.mapper.NatmehaSignalSourceMapper;
import com.gyt.gytApi.service.INatmehaSignalSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
*
*/
@Service
public class NatmehaSignalSourceServiceImpl implements INatmehaSignalSourceService {

    @Autowired
    NatmehaSignalSourceMapper natmehaSignalSourceMapper;

    @Override
    public NatmehaSignalSourceDTO selectDoctorSignalSource(String doctorCode, Date startTime, Date endTime) {
        return natmehaSignalSourceMapper.selectDoctorSignalSource(doctorCode, startTime, endTime);
    }

    @Override
    public NatmehaSignalSourceDTO selectDoctorNewlySignal(String doctorCode, Date startTime, Date endTime) {
        return natmehaSignalSourceMapper.selectDoctorNewlySignal(doctorCode, startTime, endTime);
    }

    @Override
    public Integer selectNextNo(String doctorCode, Date startTime, Date endTime) {
        return natmehaSignalSourceMapper.selectNextNo(doctorCode, startTime, endTime);
    }

    @Override
    public List<NatmehaSignalSourceDTO> selectTodayInWorkDoctorList(String hospitalCode, Date startTime, Date endTime) {
        return natmehaSignalSourceMapper.selectTodayInWorkDoctorList(hospitalCode, startTime, endTime);
    }
}
