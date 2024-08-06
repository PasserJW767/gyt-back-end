package com.gyt.gytApi.service.impl;

import com.github.pagehelper.Page;
import com.gyt.gytApi.domain.NatmehaProjectDTO;
import com.gyt.gytApi.service.INatmehaProjectService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class INatmehaProjectServiceImplTest {
    @Autowired
    INatmehaProjectService INatmehaProjectService;

    @Test
    void getHosDetailLaunchProjects() {
        String hosItemCode="f3a3903c-2f72-4090-af97-627210479239";
        final Page<NatmehaProjectDTO> hosDetailLaunchProjects = INatmehaProjectService.getHosDetailLaunchProjects(hosItemCode);
        System.out.println(hosDetailLaunchProjects);
    }
}