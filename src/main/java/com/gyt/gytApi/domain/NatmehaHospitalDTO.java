package com.gyt.gytApi.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 国医堂信息记录表
 * @TableName tb_natmeha_hospital
 */
@Data
@ToString
public class NatmehaHospitalDTO implements Serializable {
    /**
     * 自增id
     */
    private Integer itemid;

    /**
     * UUID
     */
    private String itemcode;

    /**
     * 国医堂名称
     */
    private String hospitalName;

    /**
     * 医院等级
     */
    private String hospitalLevel;

    /**
     * 预约量
     */
    private Integer hospitalBooking;

    /**
     * 评分
     */
    private Double hospitalSource;

    /**
     * 距离（暂定）
     */
    private Integer hospitalDistance;

    /**
     * 医院电话
     */
    private String hospitalPhone;

    /**
     * 医院地址省份
     */
    private String hospitalPro;

    /**
     * 医院地址市
     */
    private String hospitalCity;

    /**
     * 地址省份
     */
    private String hospitalCountry;

    /**
     * 医院详细地址
     */
    private String hospitalAdress;

    /**
     * 数据状态
     */
    private String status;

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
     * 简介
     */
    private String introduce;

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    public Integer getItemid() {
        return itemid;
    }

    /**
     * 自增id
     */
    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    /**
     * UUID
     */
    public String getItemcode() {
        return itemcode;
    }

    /**
     * UUID
     */
    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    /**
     * 国医堂名称
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * 国医堂名称
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * 医院等级
     */
    public String getHospitalLevel() {
        return hospitalLevel;
    }

    /**
     * 医院等级
     */
    public void setHospitalLevel(String hospitalLevel) {
        this.hospitalLevel = hospitalLevel;
    }

    /**
     * 预约量
     */
    public Integer getHospitalBooking() {
        return hospitalBooking;
    }

    /**
     * 预约量
     */
    public void setHospitalBooking(Integer hospitalBooking) {
        this.hospitalBooking = hospitalBooking;
    }

    /**
     * 评分
     */
    public Double getHospitalSource() {
        return hospitalSource;
    }

    /**
     * 评分
     */
    public void setHospitalSource(Double hospitalSource) {
        this.hospitalSource = hospitalSource;
    }

    /**
     * 距离（暂定）
     */
    public Integer getHospitalDistance() {
        return hospitalDistance;
    }

    /**
     * 距离（暂定）
     */
    public void setHospitalDistance(Integer hospitalDistance) {
        this.hospitalDistance = hospitalDistance;
    }

    /**
     * 医院电话
     */
    public String getHospitalPhone() {
        return hospitalPhone;
    }

    /**
     * 医院电话
     */
    public void setHospitalPhone(String hospitalPhone) {
        this.hospitalPhone = hospitalPhone;
    }

    /**
     * 医院地址省份
     */
    public String getHospitalPro() {
        return hospitalPro;
    }

    /**
     * 医院地址省份
     */
    public void setHospitalPro(String hospitalPro) {
        this.hospitalPro = hospitalPro;
    }

    /**
     * 医院地址市
     */
    public String getHospitalCity() {
        return hospitalCity;
    }

    /**
     * 医院地址市
     */
    public void setHospitalCity(String hospitalCity) {
        this.hospitalCity = hospitalCity;
    }

    /**
     * 地址省份
     */
    public String getHospitalCountry() {
        return hospitalCountry;
    }

    /**
     * 地址省份
     */
    public void setHospitalCountry(String hospitalCountry) {
        this.hospitalCountry = hospitalCountry;
    }

    /**
     * 医院详细地址
     */
    public String getHospitalAdress() {
        return hospitalAdress;
    }

    /**
     * 医院详细地址
     */
    public void setHospitalAdress(String hospitalAdress) {
        this.hospitalAdress = hospitalAdress;
    }

    /**
     * 数据状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 数据状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 创建者
     */
    public String getCreater() {
        return creater;
    }

    /**
     * 创建者
     */
    public void setCreater(String creater) {
        this.creater = creater;
    }

    /**
     * 创建时间
     */
    public Date getItemcreateat() {
        return itemcreateat;
    }

    /**
     * 创建时间
     */
    public void setItemcreateat(Date itemcreateat) {
        this.itemcreateat = itemcreateat;
    }

    /**
     * 修改人
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * 修改人
     */
    public void setUpdater(String updater) {
        this.updater = updater;
    }

    /**
     * 修改时间
     */
    public Date getItemupdateat() {
        return itemupdateat;
    }

    /**
     * 修改时间
     */
    public void setItemupdateat(Date itemupdateat) {
        this.itemupdateat = itemupdateat;
    }

    /**
     * 简介
     */
    public String getIntroduce() {
        return introduce;
    }

    /**
     * 简介
     */
    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    /**
     * 剩余量（数据库中无此项）
     */
    private Integer surplus;

    /**
    *文件上传记录表对象（为了拿医院图片路径）
    */
    public NatmehaFileDTO natmehaFileDTO;

    /**
     *医院开展项目、功效特色记录
     */
    public NatmehaProjectDTO natmehaProjectDTO;

}