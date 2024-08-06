package com.gyt.gytApi.service.impl;

import com.gyt.gytApi.domain.NatmehaPatientDTO;
import com.gyt.gytApi.domain.NatmehaRegisterRefDTO;
import com.gyt.gytApi.domain.UserDTO;
import com.gyt.gytApi.mapper.UserMapper;
import com.gyt.gytApi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public UserDTO selectUserByPk(int itemid, String itemcode) {
        return userMapper.selectUserByPk(itemid, itemcode);
    }

    @Override
    public int updateUserbyPk(UserDTO user) {
        return userMapper.updateUserbyPk(user);
    }

    @Override
    public  UserDTO selectRegRef(int itemid, String itemcode) {
        return userMapper.selectRegRef(itemid, itemcode);
    }

    @Override
    public UserDTO selectPatient(int itemid, String itemcode) {
        return userMapper.selectPatient(itemid, itemcode);
    }

    @Override
    public int addpaitent(NatmehaPatientDTO natmehaPatientDTO) {
        return userMapper.addpaitent(natmehaPatientDTO);
    }

    @Override
    public int updatepatient(NatmehaPatientDTO natmehaPatientDTO) {
        return userMapper.updatepatient(natmehaPatientDTO);
    }

    @Override
    public int deletepatient(int itemid, String itemcode) {
        return userMapper.deletepatient(itemid, itemcode);
    }

    @Override
    public int updatarefSource(NatmehaRegisterRefDTO registerRefDTO) {
        return userMapper.updatarefSource(registerRefDTO);
    }

    @Override
    public UserDTO selectCostList(int itemid, String itemcode) {
        return userMapper.selectCostList(itemid, itemcode);
    }

    @Override
    public UserDTO selectForLogin(UserDTO user) {
        return userMapper.selectForLogin(user);
    }

    @Override
    public int deletePatienOfReg(String usercode, String patiencode) {
        return userMapper.deletePatienOfReg(usercode, patiencode);
    }

    @Override
    public UserDTO selectMyCollHotspotList(int itemid, String itemcode) {
        return userMapper.selectMyCollHotspotList(itemid, itemcode);
    }
}
