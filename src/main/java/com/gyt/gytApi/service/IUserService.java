package com.gyt.gytApi.service;

import com.gyt.gytApi.domain.NatmehaPatientDTO;
import com.gyt.gytApi.domain.NatmehaRegisterRefDTO;
import com.gyt.gytApi.domain.UserDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserService {
     UserDTO selectUserByPk(int itemid,String itemcode);
     int updateUserbyPk(UserDTO user);
     UserDTO selectRegRef( int itemid, String itemcode);
     UserDTO selectPatient( int itemid, String itemcode);
     int addpaitent(NatmehaPatientDTO natmehaPatientDTO);
     int updatepatient(NatmehaPatientDTO natmehaPatientDTO);
     int deletepatient( int itemid, String itemcode);
     int updatarefSource(NatmehaRegisterRefDTO registerRefDTO);
     UserDTO selectCostList(int itemid, String itemcode);
     UserDTO selectForLogin(UserDTO user);
     int deletePatienOfReg( String usercode, String patiencode);
     UserDTO selectMyCollHotspotList(int itemid, String itemcode);
}
