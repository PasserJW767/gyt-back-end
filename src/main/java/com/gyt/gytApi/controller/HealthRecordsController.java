package com.gyt.gytApi.controller;

import com.gyt.gytApi.domain.HealthRecordsDTO;
import com.gyt.gytApi.service.IHealthRecordsService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthRecords")
@CrossOrigin
@Api(value = "swagger ui 注释 api 级别")
public class HealthRecordsController {

    @Autowired
    public IHealthRecordsService IHealthRecordsService;

    @GetMapping("/select")
    public HealthRecordsDTO select(Integer id){
        return this.IHealthRecordsService.selectHealthRecords(id);
    }
}
