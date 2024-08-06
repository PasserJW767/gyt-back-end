package com.gyt.gytApi.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.ToString;

/**
 * 医院服务团队记录表
 * @TableName tb_natmeha_doctor
 */
@Data
@ToString
public class NatmehaDoctorDTO implements Serializable {
    /**
     * 自增id
     */
    private Integer itemid;

    /**
     * UUID
     */
    private String itemcode;

    /**
     * 医生姓名
     */
    private String doctorName;

    /**
     * 医生职称
     */
    private String doctorTitle;

    /**
     * 擅长治疗
     */
    private String doctorTreatment;

    /**
     * 评分
     */
    private Double doctorSorce;

    /**
     * 科室code（默认都为中医科）
     */
    private String deptCode;

    /**
     * 挂号类别
     */
    private String numType;

    /**
     * 用户code
     */
    private String userCode;

    /**
     * 创建者
     */
    private String creater;

    /**
     * 创建时间
     */
    private Date itemcreateat;

    /**
     * 修改人
     */
    private String updater;

    /**
     * 修改时间
     */
    private Date itemupdateat;

    /**
     * 机构（医院）itemcode
     */
    private String orgCode;

    private static final long serialVersionUID = 1L;

    /*号源维护记录表--那问诊量*/
    private NatmehaSignalSourceDTO natmehaSignalSourceDTO;

    /*拿医生图片*/
    private NatmehaFileDTO natmehaFileDTO;

    /*医院*/
    private NatmehaHospitalDTO natmehaHospitalDTO;
}