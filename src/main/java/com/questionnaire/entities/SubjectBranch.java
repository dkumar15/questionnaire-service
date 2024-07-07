package com.questionnaire.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name="subject_branches")
@Data
public class SubjectBranch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "subject_id")
    private Long subjectId;
    private String name;

    @CreationTimestamp
    @Column(name="created_at")
    private LocalDateTime createdAt;
    @CreationTimestamp
    @Column(name="updated_at")
    private LocalDateTime updateAt;

}
