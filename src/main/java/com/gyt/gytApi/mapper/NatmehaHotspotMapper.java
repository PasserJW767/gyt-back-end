package com.gyt.gytApi.mapper;

import com.gyt.gytApi.domain.NatmehaHotspotDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NatmehaHotspotMapper {
    public List<NatmehaHotspotDTO> selectByDataType(String dataType,String hotspotName);

    public NatmehaHotspotDTO selectByItemCode(String itemCode);
}