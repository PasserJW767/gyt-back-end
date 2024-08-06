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
public class HealthRecordsDTO {

  private Integer itemId;
  private String itemCode;
  private String name;
  private String gender;
  private Date birth;
  private String phone;
  private String adressPro;
  private String adressCity;
  private String adressCountry;
  private String adress;
  private String nation;
  private String bloodType;
  private String education;
  private String occupation;
  private double height;
  private double weight;
  private String bmi;
  private String diseaseHistory;
  private String allergy;
  private String userCode;
  private String creater;
  private Timestamp itemCreateAt;
  private String updater;
  private Timestamp itemUpdateAt;

}
