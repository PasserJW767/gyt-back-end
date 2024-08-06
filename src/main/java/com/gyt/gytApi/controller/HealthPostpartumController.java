package com.gyt.gytApi.controller;

import com.gyt.gytApi.domain.HealthPostpartumDTO;
import com.gyt.gytApi.service.IHealthPostpartumService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthPostpartum")
@CrossOrigin
@Api(value = "swagger ui 注释 api 级别")
public class HealthPostpartumController {

    @Autowired
    IHealthPostpartumService IHealthPostpartumService;

    @GetMapping("/select")
    public HealthPostpartumDTO select(Integer id){
        return this.IHealthPostpartumService.selectHealthPostpartum(id);
    }
}
