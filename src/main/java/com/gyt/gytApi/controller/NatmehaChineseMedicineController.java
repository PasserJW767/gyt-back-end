package com.gyt.gytApi.controller;

import com.gyt.gytApi.domain.NatmehaChineseMedicineDTO;
import com.gyt.gytApi.service.INatmehaChineseMedicineService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : 莫起润
 * @date : 2021/8/26/15:56
 */
@Slf4j
@RestController
@CrossOrigin
public class NatmehaChineseMedicineController {
    @Autowired
    INatmehaChineseMedicineService iNatmehaChineseMedicineService;

    /*查找中药常识表的数据*/
    @GetMapping("gyt/natmehaChineseMedicines")
    public List<NatmehaChineseMedicineDTO> selectNatmehaChineseMedicines() {
        return this.iNatmehaChineseMedicineService.selectNatmehaChineseMedicines();
    }

    @GetMapping("gyt/natmehaChineseMedicineDetail")
    public NatmehaChineseMedicineDTO selectNatmehaChineseMedicineDetail(String itemCode) {
        return this.iNatmehaChineseMedicineService.selectByItemCode(itemCode);
    }

}
