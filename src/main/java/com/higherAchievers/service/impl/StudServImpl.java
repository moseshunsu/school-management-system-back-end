package com.higherAchievers.service.impl;

import com.higherAchievers.dto.StudentRequest;
import com.higherAchievers.entity.Student;
import com.higherAchievers.service.StudServ;

public class StudServImpl implements StudServ {
    @Override
    public String registerStudent(StudentRequest studentRequest) {

        Student student = Student.builder()
                .gender(studentRequest.getGender())
                .firstName(studentRequest.getFirstName())
                .middleName(studentRequest.getMiddleName())
                .lastName(studentRequest.getLastName())
                .email(studentRequest.getEmail())
                .otherStudentDetails(studentRequest.getOtherStudentDetails())
                .dateOfBirth(studentRequest.getDateOfBirth())
                .build();

        return studentRequest.getFirstName() + " have been successfully registered";

    }
}
