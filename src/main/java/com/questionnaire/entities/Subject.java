package com.questionnaire.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="subjects")
@Data
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @CreationTimestamp
    @Column(name="created_at")
    private LocalDateTime createdAt;
    @CreationTimestamp
    @Column(name="updated_at")
    private LocalDateTime updateAt;



//    @OneToMany(targetEntity = SubjectPart.class, cascade = CascadeType.ALL)
//    @JoinColumn(name = "subject_id", referencedColumnName = "id")
//    private List<SubjectPart> subjectParts;
}
