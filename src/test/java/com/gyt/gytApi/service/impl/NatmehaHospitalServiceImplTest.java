package com.gyt.gytApi.service.impl;

import com.github.pagehelper.Page;
import com.gyt.gytApi.domain.NatmehaHospitalDTO;
import com.gyt.gytApi.domain.NatmehaProjectDTO;
import com.gyt.gytApi.service.INatmehaHospitalService;
import com.gyt.gytApi.service.INatmehaProjectService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NatmehaHospitalServiceImplTest {

    @Autowired
    INatmehaHospitalService natmehaHospitalService;
    @Autowired
    INatmehaProjectService INatmehaProjectService;

    @Test
    void getTheFirstTwoHos() {
        final Page<NatmehaHospitalDTO> theFirstTwoHos = this.natmehaHospitalService.getTheFirstTwoHos();
        for (NatmehaHospitalDTO theFirstTwoHo : theFirstTwoHos) {
            System.out.println(theFirstTwoHo.getIntroduce());
        }
    }

    @Test
    void getHosDetailIndexInfoByHosItemCode(){
        String hosItemCode="f3a3903c-2f72-4090-af97-627210479239";
        final Page<NatmehaProjectDTO> hosDetailLaunchProjects = this.INatmehaProjectService.getHosDetailLaunchProjects(hosItemCode);
        for (NatmehaProjectDTO hosDetailLaunchProject : hosDetailLaunchProjects) {
            System.out.println(hosDetailLaunchProject);
        }
    }
}