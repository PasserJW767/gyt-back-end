package com.gyt.gytApi.controller;

import com.gyt.gytApi.domain.TKQuestionDTO;
import com.gyt.gytApi.domain.TKTypeDTO;
import com.gyt.gytApi.service.impl.TKQuestionServiceImpl;
import com.gyt.gytApi.service.impl.TKTypeServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
@CrossOrigin
@Api(value = "swagger ui 注释 api 级别")
public class TKQuestionController {
    @Autowired
    private TKQuestionServiceImpl tkQuestionService;

    @Autowired
    private TKTypeServiceImpl tkTypeService;

    @GetMapping("/show")
    @ApiOperation(value = "查询所有问题",notes = "查询所有问题")
    public List<TKQuestionDTO> showList(){
        List<TKQuestionDTO> quList=this.tkQuestionService.select();
        return quList;
    }
    @GetMapping("/ppresult")
    @ApiOperation(value = "匹配质",notes = "匹配质")
    public TKTypeDTO selecttype(@RequestParam(name = "typeId")String typeId){
        TKTypeDTO tkTypeDTO=this.tkTypeService.selectByPrimaryKey(typeId);
        return tkTypeDTO;
    }

    //@RequestParam(name = "typeId")String typeId
}
