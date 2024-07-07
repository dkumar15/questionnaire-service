package com.questionnaire.controllers;

import com.questionnaire.entities.ReportRequest;
import com.questionnaire.services.ReportService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("test/report")
public class ReportController {

    private final ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping
    public ResponseEntity<Map<Long, Boolean>> getTestReport(@RequestBody ReportRequest reportRequest) {
    return ResponseEntity.status(HttpStatus.OK).body(reportService.getTestReport(reportRequest));
    }
}
