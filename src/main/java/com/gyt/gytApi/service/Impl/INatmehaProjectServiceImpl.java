package com.gyt.gytApi.service.impl;

import com.github.pagehelper.Page;
import com.gyt.gytApi.domain.NatmehaProjectDTO;
import com.gyt.gytApi.mapper.NatmehaProjectMapper;
import com.gyt.gytApi.service.INatmehaProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*
*/
@Service
public class INatmehaProjectServiceImpl implements INatmehaProjectService {

    @Autowired
    NatmehaProjectMapper natmehaProjectMapper;

    //查医院项目有关信息（project表连user表，连hospital表，再连file表拿图片）
    @Override
    public Page<NatmehaProjectDTO> getHosDetailLaunchProjects(String hosItemCode){
        return this.natmehaProjectMapper.getHosDetailLaunchProjects(hosItemCode);
    }

    @Override
    /*查医院项目有关信息（project表连user表，连hospital表，再连file表拿图片）*/
    public Page<NatmehaProjectDTO> getHosDetailCharacteristic(String hosItemCode) {
        return this.natmehaProjectMapper.getHosDetailCharacteristic(hosItemCode);
    }

}
