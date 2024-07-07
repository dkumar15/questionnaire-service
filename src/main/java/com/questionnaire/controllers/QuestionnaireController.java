package com.questionnaire.controllers;

import com.questionnaire.entities.Question;
import com.questionnaire.entities.User;
import com.questionnaire.services.QuestionnaireService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject/subject-branch")
public class QuestionnaireController {

    final static Logger logger = LoggerFactory.getLogger(QuestionnaireController.class);
    private final QuestionnaireService questionnaireService;

    public QuestionnaireController(QuestionnaireService questionnaireService) {
        this.questionnaireService = questionnaireService;
    }

    @GetMapping
    public ResponseEntity<List<Question>> getAllQuestions() {
        return ResponseEntity.status(HttpStatus.OK).body(questionnaireService.getAllQuestion());
    }

    @GetMapping("/{subjectBranchId}/{setId}/questions")
    public ResponseEntity<List<Question>> getQuestionList(@PathVariable Long subjectBranchId, @PathVariable Long setId) {
        return ResponseEntity.status(HttpStatus.OK).body(questionnaireService.getQuestions(subjectBranchId, setId));
    }

    @PostMapping("/answers")
    public ResponseEntity<String> submitAnswers(@RequestBody User userAnswers) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(questionnaireService.submitAnswers(userAnswers));
    }

    @GetMapping("/something")
    public ResponseEntity<String> createLogs() {
        logger.warn("Just checking");
        return ResponseEntity.ok().body("All Ok");
    }

}
