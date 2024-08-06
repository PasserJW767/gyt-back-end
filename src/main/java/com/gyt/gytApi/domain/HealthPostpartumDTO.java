package com.gyt.gytApi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class HealthPostpartumDTO {

  private Integer itemId;
  private String patientId;
  private String healthConditionDescr;
  private String psychologyConditionDescr;
  private String woundHealing;
  private String puerperaHealthEvalDescr;
  private String visitDoctorName;
  private String pregHealthGuide;
  private String notes;
  private String creater;
  private Timestamp itemCreateAt;
  private String updater;
  private Timestamp itemUpdateAt;
}
