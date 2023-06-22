package com.higherAchievers.entity;

import com.higherAchievers.utils.Gender;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;
import java.util.Set;

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

    private Set<String> qualifications;

    private Set<String> roles;

    @Column(nullable = false)
    private Gender gender;

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

}
