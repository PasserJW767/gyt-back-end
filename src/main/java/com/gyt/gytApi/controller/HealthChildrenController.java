package com.gyt.gytApi.controller;

import com.gyt.gytApi.domain.HealthChildrenDTO;
import com.gyt.gytApi.service.IHealthChildrenService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthChildren")
@CrossOrigin
@Api(value = "swagger ui 注释 api 级别")
public class HealthChildrenController {

    @Autowired
    IHealthChildrenService IHealthChildrenService;

    @GetMapping("/select")
    public HealthChildrenDTO select(Integer id){
        return this.IHealthChildrenService.selectHealthChildren(id);
    }
}
