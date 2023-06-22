package com.higherAchievers.dto;

import com.higherAchievers.utils.Gender;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
public class TeacherRequest {

    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private Set<String> qualifications;
    private Gender gender;
    private String password;
    private LocalDate dateOfBirth;
    private String address;
    private String phoneNumber;
    private String otherPhoneNumber;
    private LocalDate dateJoined;

}
