package com.questionnaire.services;

import com.questionnaire.entities.UserAnswer;
import com.questionnaire.entities.Question;
import com.questionnaire.entities.User;
import com.questionnaire.exceptions.SubjectPartIdNotFoundException;
import com.questionnaire.exceptions.UserNotRegisterException;
import com.questionnaire.repositories.AnswerRepository;
import com.questionnaire.repositories.CorrectAnswerChoiceRepository;
import com.questionnaire.repositories.QuestionnaireRepository;
import com.questionnaire.repositories.UserRepository;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuestionnaireService {

    private final QuestionnaireRepository questionnaireRepository;
    private final UserRepository userRepository;
    private final AnswerRepository answerRepository;
    private final CorrectAnswerChoiceRepository correctAnswerChoiceRepository;

    public QuestionnaireService(QuestionnaireRepository questionnaireRepository, UserRepository userRepository, AnswerRepository answerRepository, CorrectAnswerChoiceRepository correctAnswerChoiceRepository) {
        this.questionnaireRepository = questionnaireRepository;
        this.userRepository = userRepository;
        this.answerRepository = answerRepository;
        this.correctAnswerChoiceRepository = correctAnswerChoiceRepository;
    }

    public List<Question> getAllQuestion() {
        return (List<Question>) questionnaireRepository.findAll();
    }

    public List<Question> getQuestions(Long subjectBranchId, Long setId) {
        List<Question> questionList = questionnaireRepository.findBySubjectBranchIdAndSubjectSetId(subjectBranchId, setId);
        if (questionList.isEmpty()) {
            throw new SubjectPartIdNotFoundException("Subject id not found in database");
        }
        return questionList;
    }

    public String submitAnswers(User userAnswers) {
        List<UserAnswer> answerList = prepareUserAnswer(userAnswers);
        answerRepository.saveAll(answerList);
        return "Answers Submitted successfully, Thank you";
    }

    private List<UserAnswer> prepareUserAnswer(User userAnswers) {
        Optional<User> userOptional = userRepository.findByEmailIdAndMobileNo(userAnswers.getEmailId(), userAnswers.getMobileNo());
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            List<UserAnswer> answerList = new ArrayList<>();
            for (UserAnswer answer : userAnswers.getAnswerList()) {
                answer.setUserId(user.getId());
                answerList.add(answer);
                answer.setIsAnswerCorrect(
                        correctAnswerChoiceRepository.existsByQuestionIdAndCorrectChoicesId(answer.getQuestionId(), answer.getSelectedAnswerId())
                );
            }
            return answerList;
        } else {
            throw new UserNotRegisterException("User has not Register, Please Register your self");
        }
    }


    /*
    If you want to perform join between user and answer then it will work

    private User prepareUserAnswer(User userAnswer) {
        User user = new User(userAnswer.getUserName(), userAnswer.getEmailId(), userAnswer.getMobileNo());
        List<Answer> answerList = new ArrayList<>();
        for (Answer answerIn : userAnswer.getAnswerList()) {
            Answer answer = new Answer(answerIn.getSetId(), answerIn.getQuestionId(), answerIn.getSelectedAnswerId());
            answer.setUser(user);
            answerList.add(answer);
        }
        user.setAnswerList(answerList);
        return user;
    }*/
}
