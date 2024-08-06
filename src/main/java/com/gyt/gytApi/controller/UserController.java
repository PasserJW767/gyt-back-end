package com.gyt.gytApi.controller;

import com.gyt.gytApi.domain.UserDTO;
import com.gyt.gytApi.domain.UserDTO;
import com.gyt.gytApi.mapper.UserMapper;
import com.gyt.gytApi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gyt.gytApi.domain.NatmehaPatientDTO;
import com.gyt.gytApi.domain.NatmehaRegisterRefDTO;
import com.gyt.gytApi.service.IUserService;
import com.gyt.gytApi.util.FileUtil;
import com.gyt.gytApi.util.GetAge;
import com.gyt.gytApi.util.IdCardUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping("/userDetail")
    @ResponseBody
    public UserDTO Userdetail(int itemid, String itemcode) {
        UserDTO user = userService.selectUserByPk(itemid, itemcode);
        return userService.selectUserByPk(itemid, itemcode);
    }

    @PostMapping("/updatauser")
    public UserDTO updatauser(UserDTO user,MultipartFile file) {
        UserDTO updatauser=user;
        if(!file.isEmpty()) {
            // 获取文件名称,包含后缀
            String fileName = file.getOriginalFilename();
            String path="D:/dev/nginx-1.20.1/html/gyt/touxiang/";
            // 存放在这个路径下：该路径是该工程目录下的static文件****：该文件可能需要自己创建)
            // 放在static下的原因是，存放的是静态文件资源，即通过浏览器输入本地服务器地址，加文件名时是可以访问到的
        /*    String path = "portals.image.io/gyt/touxiang/";*/
            try {
                Date date = new Date();
                fileName = date.getTime()+""+date.getSeconds()+"."+fileName.substring(fileName.lastIndexOf(".") + 1);;
                FileUtil.fileupload(file.getBytes(), path, fileName);
                updatauser.setPortrait("http://localhost:9090/"+fileName);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int i = userService.updateUserbyPk(user);
        if (i == 1) {
            return updatauser;
        }
        return null;
    }

    @GetMapping("/regRef")
    public UserDTO regRef(int itemid, String itemcode) {
        UserDTO user = userService.selectRegRef(itemid, itemcode);
        return user;
    }

    @GetMapping("/patient")
    public UserDTO patient(int itemid, String itemcode) {
        UserDTO user = userService.selectPatient(itemid, itemcode);
        for (NatmehaPatientDTO natmehaPatientDTO : user.getNatmehaPatientDTOList()) {
            int age = GetAge.getAgeByBirth(natmehaPatientDTO.getBirthdate());
            natmehaPatientDTO.setAge(age);
        }
        return user;
    }

    @PostMapping("/addpatient")
    public int addpatient(NatmehaPatientDTO natmehaPatientDTO) {
        if (IdCardUtil.isIDNumber(natmehaPatientDTO.getIdcardNo())) {
            natmehaPatientDTO.setIdcardType("居民身份证");
        } else {
            natmehaPatientDTO.setIdcardType("港澳台身份证");
        }
        return userService.addpaitent(natmehaPatientDTO);
    }

    @PostMapping("/updatapatient")
    public int updatapatient(NatmehaPatientDTO natmehaPatientDTO) {
        return userService.updatepatient(natmehaPatientDTO);
    }

    @DeleteMapping("deletepatient")
    public int deletepatient(int itemid, String itemcode,String usercode) {
        int i = userService.deletePatienOfReg(usercode, itemcode);
        return userService.deletepatient(itemid, itemcode);
    }

    @PostMapping("/updataRegResource")
    public int updatarefSource(NatmehaRegisterRefDTO registerRefDTO) {
        return userService.updatarefSource(registerRefDTO);
    }

    @GetMapping("/costList")
    public UserDTO selectCostlist(int itemid, String itemcode) {
        UserDTO user = userService.selectCostList(itemid, itemcode);
        return user;
    }

    @GetMapping("/login")
    public UserDTO selectForLogin(@RequestParam String username,@RequestParam String password){
        UserDTO user = new UserDTO();
        user.setUsername(username);
        user.setPassword(password);
        UserDTO userDTO = userService.selectForLogin(user);
        if(userDTO!=null){
            return userDTO;
        }else{
            return null;
        }
    }

    @GetMapping("/collhotspotList")
    public UserDTO seletctCollHotSpotList(int itemid,String itemcode) {
        UserDTO user = userService.selectMyCollHotspotList(itemid, itemcode);
        return user;
    }
}
