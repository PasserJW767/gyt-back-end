package com.gyt.gytApi.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * t_knowledge_tcm_question
 * @author 
 */
@Data
public class TKQuestionDTO implements Serializable {
    private String qId;

    private String typeId;

    private String qNumber;

    private String qText;

    private String optionsText;

    private String optionsValue;

    private String delFlag;

    private String feaId;

    private String qSex;

    private static final long serialVersionUID = 1L;
}