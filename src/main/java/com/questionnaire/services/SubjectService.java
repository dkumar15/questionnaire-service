package com.questionnaire.services;

import com.questionnaire.exceptions.SubjectIdNotFoundException;
import com.questionnaire.exceptions.UnableToSaveSubjectsException;
import com.questionnaire.entities.Subject;
import com.questionnaire.exceptions.UnableToUpdateSubjectsException;
import com.questionnaire.repositories.SubjectRepository;
import org.hibernate.tool.schema.spi.SqlScriptException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {

    private final SubjectRepository subjectRepository;

    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }


    public List<Subject> getSubjects() {
        return (List<Subject>) subjectRepository.findAll();
    }

    public String saveSubjects(List<Subject> subjects) {
        try {
            subjectRepository.saveAll(subjects);
            return "Subject(s) added successfully";
        } catch (SqlScriptException scriptException) {
            throw new SqlScriptException("Unable to save the subject(s)", scriptException);
        } catch (Exception e) {
            throw new UnableToSaveSubjectsException("Unable to save the subject(s)");
        }
    }

    public String updateRecord(Long subjectId, Subject subject) {
        Optional<Subject> subjectOptional = subjectRepository.findById(subjectId);
        if(subjectOptional.isEmpty()) {
            throw new SubjectIdNotFoundException("SubjectId Not Found in Database, Please check and retry");
        }

        try {
            Subject subjectFromDb = subjectOptional.get();
            subjectFromDb.setName(subject.getName());
            subjectRepository.save(subjectFromDb);
            return "Update the record successFull";
        } catch (Exception e) {
            throw new UnableToUpdateSubjectsException("Unable to update the subject(s)");
        }
    }
}
