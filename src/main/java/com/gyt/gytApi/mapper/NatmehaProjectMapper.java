package com.gyt.gytApi.mapper;


import com.github.pagehelper.Page;
import com.gyt.gytApi.domain.NatmehaProjectDTO;
import org.apache.ibatis.annotations.Mapper;

/**
* @Entity com.gyt.gytApi.domain.NatmehaProjectDTO
*/
@Mapper
public interface NatmehaProjectMapper{
    /*查医院项目有关信息（project表连user表，连hospital表，再连file表拿图片）*/
    public Page<NatmehaProjectDTO> getHosDetailLaunchProjects(String hosItemCode);

    /*查医院功效特色有关信息（project表连user表，连hospital表，再连file表拿图片）*/
    public Page<NatmehaProjectDTO> getHosDetailCharacteristic(String hosItemCode);
}
