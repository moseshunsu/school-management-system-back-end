package com.higherAchievers.service.impl;

import com.higherAchievers.dto.TeacherRequest;
import com.higherAchievers.entity.Teacher;
import com.higherAchievers.repository.TeacherRepository;
import com.higherAchievers.service.TeacherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;
    private final PasswordEncoder passwordEncoder;

    public TeacherServiceImpl(TeacherRepository teacherRepository, PasswordEncoder passwordEncoder) {
        this.teacherRepository = teacherRepository;
        this.passwordEncoder = passwordEncoder;
    }

//    public TeacherServiceImpl(TeacherRepository teacherRepository) {
//        this.teacherRepository = teacherRepository;
//    }

    @Override
    public ResponseEntity<String> registerTeacher(TeacherRequest teacherRequest) {

        //boolean isExists = teacherRepository.existsByUsernameOrEmailAllIgnoreCase();

        if (teacherRepository.existsByEmail(teacherRequest.getEmail())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Teacher with email " + teacherRequest.getEmail() + " already exists");
        }

        if (teacherRepository.existsByUsername(teacherRequest.getUsername())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Teacher with username " + teacherRequest.getUsername() + " already exists");
        }

        Teacher teacher = Teacher.builder()
                .firstName(teacherRequest.getFirstName())
                .middleName(teacherRequest.getMiddleName())
                .lastName(teacherRequest.getLastName())
                .email(teacherRequest.getEmail())
                .qualifications(teacherRequest.getQualifications())
                .role(teacherRequest.getRole()) // use ternary operator
                .gender(teacherRequest.getGender()) //also try using one here
                .username(teacherRequest.getUsername())
                .password(passwordEncoder.encode(teacherRequest.getPassword()))
                .dateOfBirth(teacherRequest.getDateOfBirth())
                .address(teacherRequest.getAddress())
                .phoneNumber(teacherRequest.getPhoneNumber())
                .otherPhoneNumber(teacherRequest.getOtherPhoneNumber())
                .dateJoined(teacherRequest.getDateJoined())
                .build();

        teacherRepository.save(teacher);

        return ResponseEntity.status(HttpStatus.CREATED).body("Teacher Registered Successfully");

    }

}
