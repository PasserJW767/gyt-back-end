package com.gyt.gytApi.controller;

import com.gyt.gytApi.domain.HealthDiabetesDTO;
import com.gyt.gytApi.service.IHealthDiabetesService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthDiabetes")
@CrossOrigin
@Api(value = "swagger ui 注释 api 级别")
public class HealthDiabetesController {

    @Autowired
    IHealthDiabetesService IHealthDiabetesService;

    @GetMapping("/select")
    public HealthDiabetesDTO select(Integer id){
        return this.IHealthDiabetesService.selectHealthDiabetes(id);
    }
}
