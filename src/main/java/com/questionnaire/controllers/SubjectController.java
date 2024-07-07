package com.questionnaire.controllers;

import com.questionnaire.entities.Subject;
import com.questionnaire.services.SubjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping
    public ResponseEntity<List<Subject>> getSubjects() {
        List<Subject> subjectList =  subjectService.getSubjects();
        return ResponseEntity.status(HttpStatus.OK).body(subjectList);
    }

    @PostMapping
    public ResponseEntity<String> addSubjects(@RequestBody List<Subject> subjects) {
        return ResponseEntity.status(HttpStatus.CREATED).body(subjectService.saveSubjects(subjects));
    }

    @PutMapping("/{subjectId}")
    public ResponseEntity<String> updateRecord(@PathVariable Long subjectId, @RequestBody Subject subject) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(subjectService.updateRecord(subjectId, subject));
    }
}
