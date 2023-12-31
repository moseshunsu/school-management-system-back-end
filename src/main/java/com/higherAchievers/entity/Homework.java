package com.higherAchievers.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
    private Student student;
}
