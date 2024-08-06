package com.gyt.gytApi.controller;

import com.gyt.gytApi.domain.HealthBaseDTO;
import com.gyt.gytApi.service.IHealthBaseService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthBase")
@CrossOrigin
@Api(value = "swagger ui 注释 api 级别")
public class HealthBaseController {

    @Autowired
    IHealthBaseService IHealthBaseService;

    @GetMapping("/select")
    public HealthBaseDTO select(Integer id){
        return this.IHealthBaseService.selectHealthBase(id);
    }
}
