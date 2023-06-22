package com.higherAchievers.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TeacherRequest {

    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String qualifications;
    private String role;
    private String gender;
    private String username;
    private String password;
    private LocalDate dateOfBirth;
    private String address;
    private String phoneNumber;
    private String otherPhoneNumber;
    private LocalDate dateJoined;

}
