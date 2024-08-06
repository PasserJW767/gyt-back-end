package com.gyt.gytApi.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * tb_natmeha_hotspot
 * @author 
 */
@Data
public class NatmehaHotspotDTO implements Serializable {
    /**
     * 自增id
     */
    private Integer itemId;
    /**
     * 唯一标识
     */
    private String itemCode;
    /**
     * 热点名称
     */
    private String hotspotTitle;

    /**
     * 介绍
     */
    private String hotspotContent;

    /**
     * 数据状态
     */
    private String dataStatus;

    /**
     * 数据类型(用来区分处中药常识以外几项）
     */
    private String dataType;

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
    /*
     *图片文件
     */
    NatmehaFileDTO natmehaFileDTO;

    private static final long serialVersionUID = 1L;
}