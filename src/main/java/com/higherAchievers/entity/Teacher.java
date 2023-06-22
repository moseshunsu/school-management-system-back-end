package com.higherAchievers.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "teachers")
@Entity
public class Teacher {

    @Id
    @Column(name = "teacher_id")
    @GeneratedValue(generator = "native")
    @GenericGenerator(name = "native")
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String qualifications;

    @Column(name = "roles")
    private String role;

    @Column(nullable = false)
    private String gender;

    @Column(unique = true)
    private String username;

    @Column(nullable = false, length = 100)
    private String password;

    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;

    @Column(nullable = false)
    private String address;

    @Column(name = "phone_number", nullable = false, length = 20)
    private String phoneNumber;

    @Column(name = "other_phone_number", length = 20)
    private String otherPhoneNumber;

    @Column(name = "date_joined")
    private LocalDate dateJoined;

    @Column(name = "last_modified_at")
    @UpdateTimestamp
    private LocalDateTime modifiedAt;

}
