package com.gyt.gytApi.controller;

import com.gyt.gytApi.domain.NatmehaHotsCollRefDTO;
import com.gyt.gytApi.domain.NatmehaHotspotDTO;
import com.gyt.gytApi.service.INatmehaHotsCollRefService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : 莫起润
 * @date : 2021/8/26/23:37
 */
@Slf4j
@RestController
@CrossOrigin
public class NatmehaHotsCollRefController {
    @Autowired
    INatmehaHotsCollRefService iNatmehaHotsCollRefService;

    @GetMapping("gyt/queryNatmehaHotsCollRef")
    public String judgeCollect(String userCode,String hotspotCode) {
        String msg = "";
        NatmehaHotsCollRefDTO hotspotRef = this.iNatmehaHotsCollRefService.selectByHospotCodeAndUserCode(hotspotCode,userCode);
        System.out.println(hotspotRef);
        if (hotspotRef!=null) {
            msg= "exist";
        }else {
            msg="noexist";
        }
        return msg;
    }

    @GetMapping("gyt/insertHotspot")
    public String insertNatmehaHotsCollRef (String userCode,String hotspotCode) {
        String msg = "";
        int result = this.iNatmehaHotsCollRefService.insertHotSpot(hotspotCode, userCode);
        System.out.println(result);
        if (result==0) {
            msg="fail";
        }else {
            msg="success";
        }
        return msg;
    }


    @GetMapping("gyt/deleteHotspot")
    public String deleteNatmehaHotsCollRef (String userCode,String hotspotCode) {
        String msg = "";
        int result = this.iNatmehaHotsCollRefService.deleteHotSpot(hotspotCode, userCode);
        if (result==0) {
            msg="fail";
        }else {
            msg="success";
        }
        return msg;
    }

}
