package com.higherAchievers.service.impl;

import com.higherAchievers.dto.StudentRequest;
import com.higherAchievers.entity.Student;
import com.higherAchievers.repository.StudRepository;
import com.higherAchievers.service.StudServ;
import org.springframework.stereotype.Service;

@Service
public class StudServImpl implements StudServ {

    private final StudRepository studRepository;

    public StudServImpl(StudRepository studRepository) {
        this.studRepository = studRepository;
    }

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

        studRepository.save(student);

        return studentRequest.getFirstName() + " have been successfully registered";

    }
}
