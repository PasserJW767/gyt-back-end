package com.gyt.gytApi.service.impl;

import com.github.pagehelper.Page;
import com.gyt.gytApi.domain.NatmehaDoctorDTO;
import com.gyt.gytApi.service.INatmehaDoctorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NatmehaDoctorServiceImplTest {
    @Autowired
    INatmehaDoctorService natmehaDoctorService;

    @Test
    void getHosDetailServiceTeam() {
        String hosItemCode="f3a3903c-2f72-4090-af97-627210479239";
        final Page<NatmehaDoctorDTO> hosDetailServiceTeam = this.natmehaDoctorService.getHosDetailServiceTeam(hosItemCode);
        for (NatmehaDoctorDTO natmehaDoctorDTO : hosDetailServiceTeam) {
            System.out.println(natmehaDoctorDTO);
        }
    }
}