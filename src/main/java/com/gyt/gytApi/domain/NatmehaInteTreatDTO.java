package com.gyt.gytApi.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.ToString;

/**
 * tb_natmeha_inte_treat
 * @author 
 */
@Data
@ToString
public class NatmehaInteTreatDTO implements Serializable {
    private Integer itemid;

    /**
     * 唯一标识UUID
     */
    private String itemcode;
    /**
     * 性别
     */
    private String gender;

    /**
     * 证件号码
     */
    private Date birth;

    /**
     * 不适部位
     */
    private String discomfortSite;

    /**
     * 不适症状
     */
    private String symptom;

    /**
     * 辅助描述症状
     */
    private String describe;

    /**
     * 处于节点位置
     */
    private String position;

    /**
     * 节点是否完成
     */
    private String status;

    /**
     * 用户code
     */
    private String userCode;

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