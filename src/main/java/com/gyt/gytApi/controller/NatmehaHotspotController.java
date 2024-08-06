package com.gyt.gytApi.controller;

import com.gyt.gytApi.domain.NatmehaHotspotDTO;
import com.gyt.gytApi.service.INatmehaHotspotService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : 莫起润
 * @date : 2021/8/26/15:56
 */
@Slf4j
@RestController
@CrossOrigin
public class NatmehaHotspotController {
    @Autowired
    INatmehaHotspotService iNatmehaHotspotService;


    /*
    *根据dataType查找不同类型的热点数据
    */
    @GetMapping("gyt/natmehaHotspots")
    public List<NatmehaHotspotDTO> selectByDataType(String dataType,String hotspotName) {
        List<NatmehaHotspotDTO> natmehaHotspotDTOS = this.iNatmehaHotspotService.selectByDataType(dataType,hotspotName);
        return natmehaHotspotDTOS;
    }

    @GetMapping("gyt/natmehaHotspotDetail")
    public NatmehaHotspotDTO selectNatmehaHotspotDetail(String itemCode) {
        NatmehaHotspotDTO natmehaHotspotDTO = this.iNatmehaHotspotService.selectByItemCode(itemCode);
        System.out.println(natmehaHotspotDTO);
        return natmehaHotspotDTO;
    }
}
