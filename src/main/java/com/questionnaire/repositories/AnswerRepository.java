package com.questionnaire.repositories;

import com.questionnaire.entities.UserAnswer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnswerRepository extends CrudRepository<UserAnswer, Long> {
    List<UserAnswer> findByUserIdAndSubjectBranchIdAndSubjectSetId(Long userId, Long subjectBranchId, int subjectSetId);
}
