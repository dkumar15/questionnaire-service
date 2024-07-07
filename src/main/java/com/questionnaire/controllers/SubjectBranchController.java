package com.questionnaire.controllers;

import com.questionnaire.entities.SubjectBranch;
import com.questionnaire.services.SubjectPartService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectBranchController {

    private final SubjectPartService subjectPartService;

    public SubjectBranchController(SubjectPartService subjectPartService) {
        this.subjectPartService = subjectPartService;
    }

    @GetMapping("/{subjectId}/branch")
    public ResponseEntity<List<SubjectBranch>> getSubjectParts(@PathVariable("subjectId") Long subjectId) {
        return ResponseEntity.status(HttpStatus.OK).body(subjectPartService.getSubjectParts(subjectId));
    }
}
