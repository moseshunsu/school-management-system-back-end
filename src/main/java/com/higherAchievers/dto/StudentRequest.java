package com.higherAchievers.dto;

import com.higherAchievers.utils.Gender;
import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentRequest {

    private Gender gender;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private LocalDate dateOfBirth;
    private String otherStudentDetails;

}
