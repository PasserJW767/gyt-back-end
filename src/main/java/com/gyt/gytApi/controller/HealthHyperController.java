package com.gyt.gytApi.controller;

import com.gyt.gytApi.domain.HealthHyperDTO;
import com.gyt.gytApi.service.IHealthHyperService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthHyper")
@CrossOrigin
@Api(value = "swagger ui 注释 api 级别")
public class HealthHyperController {

    @Autowired
    IHealthHyperService IHealthHyperService;

    @GetMapping("/select")
    public HealthHyperDTO select(Integer id){
        return this.IHealthHyperService.selectHealthHyper(id);
    }
}
