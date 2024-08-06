package com.gyt.gytApi.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * tb_natmeha_hots_coll_ref
 * @author 
 */
@Data
public class NatmehaHotsCollRefDTO implements Serializable {

    private Integer itemId;

    /**
     * 唯一标识UUID
     */
    private String itemCode;
    /**
     * 热点code（中药常识code）
     */
    private String hotspotCode;

    /**
     * 用户code
     */
    private String userCode;

    private String creater;

    private Date itemcreateat;

    private String updater;

    private Date itemupdateat;

    //我的收藏 一对一
    NatmehaHotspotDTO natmehaHotspotDTO;

    private static final long serialVersionUID = 1L;
}