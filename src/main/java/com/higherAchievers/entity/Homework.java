package com.higherAchievers.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name = "homework")
public class Homework {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "date_created")
    private LocalDateTime dateCreated;

    @Column(name = "homework_content")
    private String homeWorkContent;

    @Column(updatable = false, nullable = false)
    private int mark;

    @Column(name = "other_homework_details")
    private String otherHomeworkDetails;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;
}
