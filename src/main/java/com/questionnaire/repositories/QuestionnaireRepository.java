package com.questionnaire.repositories;

import com.questionnaire.entities.Question;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuestionnaireRepository extends CrudRepository<Question, Long> {
    List<Question> findBySubjectBranchIdAndSubjectSetId(Long subjectBranchId, Long setId);
}
