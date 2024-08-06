package com.gyt.gytApi.controller;

import com.gyt.gytApi.domain.NatmehaInteTreatDTO;
import com.gyt.gytApi.service.INatmehaInteTreatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * 智能导诊
 */
@CrossOrigin/*跨域请求*/
@RestController
@RequestMapping("/natmehaInteTreat")
public class NatmehaInteTreatController {
    @Autowired
    INatmehaInteTreatService INatmehaInteTreatService;

    /*选择性插入智能导诊数据*/
    @PostMapping("/insert")
    public String insertSelectiveInteTreat(@RequestParam(required = false) String gender,
                                        @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date birth,
                                        @RequestParam(required = false) String discomfortSite,
                                        @RequestParam(required = false) String symptom,
                                        @RequestParam(required = false) String describe) {
        NatmehaInteTreatDTO natmehaInteTreatDTO = new NatmehaInteTreatDTO();
        natmehaInteTreatDTO.setBirth(birth);
        natmehaInteTreatDTO.setGender(gender);
        natmehaInteTreatDTO.setDiscomfortSite(discomfortSite);
        natmehaInteTreatDTO.setSymptom(symptom);
        natmehaInteTreatDTO.setDescribe(describe);
        System.out.println(natmehaInteTreatDTO.toString());
        int i = INatmehaInteTreatService.insertSelectiveInteTreat(natmehaInteTreatDTO);
        return Integer.toString(i);
    }
}
