package com.questionnaire.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="subject_branch_id")
    private Long subjectBranchId;
//    @Column(name = "previous_Question_Id")
//    private int previousQuestionId;
//    @Column(name = "next_Question_Id")
//    private int nextQuestionId;

    @Column(name = "subject_set_Id")
    private int subjectSetId;
    @Column(name = "display_text")
    private String displayText;

    //@OneToMany(fetch = FetchType.LAZY, mappedBy = "question", cascade = CascadeType.ALL)
    @OneToMany(targetEntity = AnswerChoice.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "question_id", referencedColumnName = "id")
    private List<AnswerChoice> answerChoicesList;

    @CreationTimestamp
    @Column(name="created_at")
    private LocalDateTime createdAt;
    @CreationTimestamp
    @Column(name="updated_at")
    private LocalDateTime updateAt;
}
