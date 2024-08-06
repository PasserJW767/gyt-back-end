package com.gyt.gytApi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.Date;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class HealthBaseDTO {

  private Integer itemId;
  private String patientId;
  private String name;
  private String idType;
  private String idNo;
  private String sex;
  private Date birthDate;
  private String education;
  private String accoProperty;
  private String marriage;
  private String mobilePhone;
  private String nationality;
  private String birthPlace;
  private String pastSicknessType;
  private String familyDisease;
  private String patientRelation;
  private String creater;
  private Timestamp itemCreateAt;
  private String updater;
  private Timestamp itemUpdateAt;
}
