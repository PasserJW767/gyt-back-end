package com.gyt.gytApi.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * tb_natmeha_chinese_medicine
 * @author 
 */
@Data
public class NatmehaChineseMedicineDTO  implements Serializable {
    /**
     * 自增id
     */
    private Integer itemId;
    /**
     * 唯一标识
     */
    private String itemCode;
    /**
     * 中药材名称
     */
    private String name;

    /**
     * 别名
     */
    private String alias;

    /**
     * 功效分类
     */
    private String classification;

    /**
     * 采制
     */
    private String harvesting;

    /**
     * 性味
     */
    private String taste;

    /**
     * 归经
     */
    private String merTropism;

    /**
     * 主治
     */
    private String governance;

    /**
     * 用法用量
     */
    private String usage;

    /**
     * 数据状态
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

    NatmehaFileDTO natmehaFileDTO;

    private static final long serialVersionUID = 1L;
}