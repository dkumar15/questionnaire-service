package com.questionnaire.repositories;

import com.questionnaire.entities.SubjectBranch;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SubjectPartRepository extends CrudRepository<SubjectBranch, Long> {

    List<SubjectBranch> findBySubjectId(Long subjectId);
}
