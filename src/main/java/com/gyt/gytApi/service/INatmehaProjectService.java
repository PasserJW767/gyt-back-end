package com.gyt.gytApi.service;

import com.github.pagehelper.Page;
import com.gyt.gytApi.domain.NatmehaProjectDTO;

/**
*
*/
public interface INatmehaProjectService {

    //查医院项目有关信息（project表连user表，连hospital表，再连file表拿图片）
    public Page<NatmehaProjectDTO> getHosDetailLaunchProjects(String hosItemCode);

    /*查医院功效特色有关信息（project表连user表，连hospital表，再连file表拿图片）*/
    public Page<NatmehaProjectDTO> getHosDetailCharacteristic(String hosItemCode);
}
