package com.gyt.gytApi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class HealthChildrenDTO {
    public Integer itemId;
    public String itemCode;
    public String patientId;//baseinfo中patient_id
    public String newBornName;//新生儿姓名
    public String newBornSex;//新生儿性别
    public Date newBornBirthDate;//新生儿出生日期
    public String examSummary;//总检结论
    public String newBornIdType;//新生儿身份证件类别
    public String newBornIdNo;//新生儿身份证件号码
    public String fatherName;//父亲姓名
    public String motherName;//母亲姓名
    public BigDecimal birthWeight;//出生体重(g)
    public BigDecimal birthLength;//出生身长
    public BigDecimal weight;//体重
    public BigDecimal length;//身长
    public String feedWay;//喂养方式类别
    public String drugRoute;//药物使用途径
    public Integer dailyFeedingTimes;//每天吃奶次数
    public Integer dailyFeedingAmount;//每天吃奶量（mL)
    public Integer stoolTimes;//既往患病种类
    public String visitDoctorName;//随访医生名称
    public Date thisVisitDate;//本次访问日期
    public Date nextVisitDate;//下次访问日期
    public String creater;//创建人
    public Timestamp itemCreateAt;//创建时间
    public String updater;//修改人
    public Timestamp itemUpdateAt;//修改时间
}
