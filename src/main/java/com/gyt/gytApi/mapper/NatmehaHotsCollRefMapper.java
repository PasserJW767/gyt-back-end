package com.gyt.gytApi.mapper;

import com.gyt.gytApi.domain.NatmehaHotsCollRefDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NatmehaHotsCollRefMapper {
    public NatmehaHotsCollRefDTO selectByHospotCodeAndUserCode(String hotspotCode,String userCode);

    public int insertHotSpot(String hotspotCode, String userCode);
    public int deleteHotSpot(String hotspotCode, String userCode);
}