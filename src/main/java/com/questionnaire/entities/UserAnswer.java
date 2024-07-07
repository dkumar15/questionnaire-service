package com.questionnaire.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "user_answers")
public class UserAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_id")
//    private User user;

    @Column(name="user_id")
    private Long userId;
    @Column(name="subject_branch_id")
    private Long subjectBranchId;
    @Column(name = "subject_set_Id")
    private int subjectSetId;
    @Column(name = "question_id")
    private Long questionId;
    @Column(name = "selected_answer_id")
    private Long selectedAnswerId;
    @Column(name = "is_answer_correct")
    private Boolean isAnswerCorrect;
    @CreationTimestamp
    @Column(name="created_at")
    private LocalDateTime createdAt;
    @CreationTimestamp
    @Column(name="updated_at")
    private LocalDateTime updateAt;

}
