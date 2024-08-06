package com.gyt.gytApi.service;

import com.gyt.gytApi.domain.NatmehaHotspotDTO;

import java.util.List;

/**
 * @author : 莫起润
 * @date : 2021/8/26/15:51
 */
public interface INatmehaHotspotService {
    public List<NatmehaHotspotDTO> selectByDataType(String dataType,String hotspotName);
    public NatmehaHotspotDTO selectByItemCode(String itemCode);
}
