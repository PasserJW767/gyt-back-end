package com.gyt.gytApi.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * organization
 * @author 
 */
@Data
public class OrganizationDTO implements Serializable {
    private Integer itemid;

    /**
     * 唯一标识UUID
     */
    private String itemcode;

    /**
     * 机构名称
     */
    private String orgName;

    /**
     * 机构编码
     */
    private String orgCode;

    /**
     * 描述
     */
    private String orgDescription;

    /**
     * 标识符(用来标识机构类型)
     */
    private String orgIdentify;

    /**
     * 备用字段
     */
    private String backup1;

    /**
     * 备用字段
     */
    private String backup2;

    /**
     * 左值
     */
    private Integer left;

    /**
     * 右值
     */
    private Integer right;

    /**
     * 层级
     */
    private Integer level;

    /**
     * 创建人
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

    private static final long serialVersionUID = 1L;
}