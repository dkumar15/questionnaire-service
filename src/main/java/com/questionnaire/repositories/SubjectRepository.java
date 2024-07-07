package com.questionnaire.repositories;

import com.questionnaire.entities.Subject;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SubjectRepository extends CrudRepository<Subject, Long> {
//    List<Subject> findAll();
}
