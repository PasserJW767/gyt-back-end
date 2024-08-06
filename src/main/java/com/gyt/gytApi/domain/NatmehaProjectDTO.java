package com.gyt.gytApi.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.ToString;

/**
 * 开展项目、功效特色记录表
 * @TableName tb_natmeha_project
 */
@Data
@ToString
public class NatmehaProjectDTO implements Serializable {
    /**
     * 自增id
     */
    private Integer itemid;

    /**
     * UUID
     */
    private String itemcode;

    /**
     * 开展项目、功效特色名称
     */
    private String name;

    /**
     * 项目、功效特色简介
     */
    private String content;

    /**
     * 数据区分
     */
    private String dataType;

    /**
     * 功效特色价格
     */
    private Integer price;

    /**
     * 数据状态
     */
    private String dataStatus;

    /**
     * 
     */
    private String userCode;

    /**
     * 浏览次数
     */
    private Integer visitNum;

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
     * 评分
     */
    private Double projectSorce;

    private static final long serialVersionUID = 1L;

    /*医院*/
    private NatmehaHospitalDTO natmehaHospitalDTO;

    /*用户--匹配医院的itemCode*/
    private UserDTO userDTO;

    /*拿对应项目的图片*/
    private NatmehaFileDTO natmehaFileDTO;

}