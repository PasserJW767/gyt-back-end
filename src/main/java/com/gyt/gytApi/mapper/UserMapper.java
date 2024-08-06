package com.gyt.gytApi.mapper;

import com.gyt.gytApi.domain.NatmehaPatientDTO;
import com.gyt.gytApi.domain.NatmehaRegisterRefDTO;
import com.gyt.gytApi.domain.UserDTO;
import com.gyt.gytApi.domain.NatmehaPatientDTO;
import com.gyt.gytApi.domain.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface UserMapper {
    UserDTO selectUserByPk(@Param("itemid") int itemid, @Param("itemcode") String itemcode);

    int updateUserbyPk(@Param("user") UserDTO user);

    UserDTO  selectRegRef(@Param("itemid") int itemid, @Param("itemcode") String itemcode);
    UserDTO selectPatient(@Param("itemid") int itemid, @Param("itemcode") String itemcode);
    int addpaitent(NatmehaPatientDTO natmehaPatientDTO);

    int updatepatient(NatmehaPatientDTO natmehaPatientDTO);
   int deletepatient(@Param("itemid") int itemid, @Param("itemcode") String itemcode);

    int updatarefSource(NatmehaRegisterRefDTO registerRefDTO);

    UserDTO selectCostList(@Param("itemid") int itemid, @Param("itemcode") String itemcode);

    int deletePatienOfReg(@Param("usercode") String usercode, @Param("patiencode") String patiencode);
    UserDTO selectMyCollHotspotList(@Param("itemid") int itemid, @Param("itemcode") String itemcode);
    UserDTO selectForLogin(UserDTO user);
}