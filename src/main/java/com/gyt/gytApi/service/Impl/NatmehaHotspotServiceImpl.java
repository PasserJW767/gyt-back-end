package com.gyt.gytApi.service.impl;

import com.gyt.gytApi.domain.NatmehaHotspotDTO;
import com.gyt.gytApi.mapper.NatmehaHotspotMapper;
import com.gyt.gytApi.service.INatmehaHotspotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : 莫起润
 * @date : 2021/8/26/15:53
 */
@Service("NatmehaHotspotService")
@Transactional(propagation = Propagation.SUPPORTS,rollbackFor = Exception.class)
public class NatmehaHotspotServiceImpl  implements INatmehaHotspotService {
    @Autowired
    NatmehaHotspotMapper natmehaHotspotMapper;

    @Override
    public List<NatmehaHotspotDTO> selectByDataType(String dataType,String hotspotName) {
        return natmehaHotspotMapper.selectByDataType(dataType,hotspotName);
    }

    @Override
    public NatmehaHotspotDTO selectByItemCode(String itemCode) {
        return this.natmehaHotspotMapper.selectByItemCode(itemCode);
    }
}
