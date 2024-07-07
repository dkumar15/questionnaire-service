package com.questionnaire.services;

import com.questionnaire.entities.SubjectBranch;
import com.questionnaire.repositories.SubjectPartRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectPartService {

    private final SubjectPartRepository subjectPartRepository;

    public SubjectPartService(SubjectPartRepository subjectPartRepository) {
        this.subjectPartRepository = subjectPartRepository;
    }

    public List<SubjectBranch> getSubjectParts(Long subjectId) {
        return subjectPartRepository.findBySubjectId(subjectId);
    }
}
