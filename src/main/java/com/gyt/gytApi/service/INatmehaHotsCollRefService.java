package com.gyt.gytApi.service;

import com.gyt.gytApi.domain.NatmehaHotsCollRefDTO;

/**
 * @author : 莫起润
 * @date : 2021/8/26/23:30
 */
public interface INatmehaHotsCollRefService {
    public NatmehaHotsCollRefDTO selectByHospotCodeAndUserCode(String hotspotCode,String userCode);
    public int insertHotSpot(String hotspotCode, String userCode);
    public int deleteHotSpot(String hotspotCode, String userCode);
}
