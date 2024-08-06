package com.gyt.gytApi.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * tb_natmeha_register_ref
 * @author 
 */
@Data
public class NatmehaRegisterRefDTO implements Serializable {
    private Integer itemid;

    /**
     * 唯一标识UUID
     */
    private String itemcode;
    /**
     * 预约号码
     */
    private Integer registerNum;

    /**
     * 号源code
     */
    private String sourceCode;

    /**
     * 用户code
     */
    private String userCode;

    /**
     * 就诊人code
     */
    private String patientCode;

    /**
     * 就诊状态
     */
    private String registerStatus;

    /**
     * 匿名评价
     */
    private Boolean anonymous;

    /**
     * 总体评分
     */
    private Double overallSource;

    /**
     * 诊疗效果评分
     */
    private Double effectSource;

    /**
     * 诊疗环境评分
     */
    private Double environmentSource;

    /**
     * 服务态度评分
     */
    private Double serviceSource;

    /**
     * 所患疾病
     */
    private String illness;

    /**
     * 就诊评分
     */
    private Double source;

    private String creater;

    private Date itemcreateat;

    private String updater;

    private Date itemupdateat;
    //就诊人 一对一
    NatmehaPatientDTO natmehaPatientDTO;
    //号源维护 一对一
    NatmehaSignalSourceDTO natmehaSignalSourceDTO;

    private static final long serialVersionUID = 1L;
}