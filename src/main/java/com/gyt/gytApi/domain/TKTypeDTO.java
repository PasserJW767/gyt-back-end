package com.gyt.gytApi.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * t_knowledge_tcm_type
 * @author 
 */
@Data
public class TKTypeDTO implements Serializable {
    private String typeId;

    private String uptflag;

    private String delFlag;

    private String optionsValue;

    private String optionsText;

    /**
     * 穴位保健
     */
    private String tlTyfsXwbj;

    /**
     * 运动保健
     */
    private String tlTyfsYd;

    /**
     * 起居调摄
     */
    private String tlTyfsQj;

    /**
     * 饮食调养
     */
    private String tlTyfsYs;

    /**
     * 情志调摄
     */
    private String tlQztj;

    /**
     * 针对人群
     */
    private String tlZdrq;

    /**
     * 测评结果
     */
    private String tlZttz;

    /**
     * 对外界环境适应能力
     */
    private String lbDwjhjsynl;

    /**
     * 发病倾向
     */
    private String lbFbqx;

    /**
     * 心理特征
     */
    private String lbXltz;

    /**
     * 常见表现
     */
    private String lbCjbx;

    /**
     * 形体特征
     */
    private String lbXttz;

    /**
     * 体质特征
     */
    private String lbZttz;

    /**
     * 体质类型
     */
    private String typeNumber;

    /**
     * 体质名称
     */
    private String typeName;

    private static final long serialVersionUID = 1L;
}