package com.gyt.gytApi.service.impl;

import com.gyt.gytApi.domain.NatmehaHotsCollRefDTO;
import com.gyt.gytApi.mapper.NatmehaHotsCollRefMapper;
import com.gyt.gytApi.service.INatmehaHotsCollRefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : 莫起润
 * @date : 2021/8/26/23:31
 */
@Service("NatmehaHotsCollRefService")
@Transactional(propagation = Propagation.SUPPORTS,rollbackFor = Exception.class)
public class NatmehaHotsCollRefServiceImpl implements INatmehaHotsCollRefService {
    @Autowired
    NatmehaHotsCollRefMapper natmehaHotsCollRefMapper;

    @Override
    public NatmehaHotsCollRefDTO selectByHospotCodeAndUserCode(String hotspotCode,String userCode) {
        return this.natmehaHotsCollRefMapper.selectByHospotCodeAndUserCode(hotspotCode,userCode);
    }

    @Override
    public int insertHotSpot(String hotspotCode, String userCode) {
        return this.natmehaHotsCollRefMapper.insertHotSpot(hotspotCode,userCode);
    }

    @Override
    public int deleteHotSpot(String hotspotCode, String userCode) {
        return this.natmehaHotsCollRefMapper.deleteHotSpot(hotspotCode,userCode);
    }
}
