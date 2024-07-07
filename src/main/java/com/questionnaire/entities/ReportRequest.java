package com.questionnaire.entities;

import lombok.Data;

@Data
public class ReportRequest {
    private Long userId;
    private Long subjectBranchId;
    private int subjectSetId;
}
