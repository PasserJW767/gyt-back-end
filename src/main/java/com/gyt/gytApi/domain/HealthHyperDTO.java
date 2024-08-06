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
public class HealthHyperDTO {

  private Integer itemId;
  private String patientId;
  private String respDoctorName;
  private String visitWay;
  private Timestamp thisFollowupVisitDate;
  private String psyAdjustResult;
  private String complianceResult;
  private String visitEvalResult;
  private Timestamp nextFollowupDate;
  private String followupVisitDoctorName;
  private String symptomName;
  private String creater;
  private Timestamp itemCreateAt;
  private String updater;
  private Timestamp itemUpdateAt;

}
