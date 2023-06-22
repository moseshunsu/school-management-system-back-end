package com.higherAchievers.service;

import com.higherAchievers.dto.TeacherRequest;
import org.springframework.http.ResponseEntity;

public interface TeacherService {

    ResponseEntity<String> registerTeacher(TeacherRequest teacherRequest);

}
