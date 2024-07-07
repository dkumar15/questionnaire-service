package com.questionnaire.repositories;


import com.questionnaire.entities.CorrectAnswerChoice;
import org.springframework.data.repository.CrudRepository;

public interface CorrectAnswerChoiceRepository extends CrudRepository<CorrectAnswerChoice, Integer> {
    Boolean existsByQuestionIdAndCorrectChoicesId(Long questionId, Long selectedAnswerId);
}
