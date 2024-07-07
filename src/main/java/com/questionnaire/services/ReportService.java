package com.questionnaire.services;

import com.questionnaire.entities.ReportRequest;
import com.questionnaire.entities.UserAnswer;
import com.questionnaire.exceptions.RecordNotFoundException;
import com.questionnaire.repositories.AnswerRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReportService {

    private final AnswerRepository answerRepository;

    public ReportService(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    public Map<Long, Boolean> getTestReport(ReportRequest reportRequest) {
        Map<Long, Boolean> userReport = new HashMap<>();
        try {
            List<UserAnswer> userAnswers = answerRepository.findByUserIdAndSubjectBranchIdAndSubjectSetId(reportRequest.getUserId(), reportRequest.getSubjectBranchId(), reportRequest.getSubjectSetId());
            for(UserAnswer userAnswer: userAnswers) {
                userReport.put(userAnswer.getQuestionId(), userAnswer.getIsAnswerCorrect());
            }
            return userReport;
        } catch (Exception e) {
            throw new RecordNotFoundException(e.getMessage());
        }

    }
}
