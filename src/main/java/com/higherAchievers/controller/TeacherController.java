package com.higherAchievers.controller;

import com.higherAchievers.dto.TeacherRequest;
import com.higherAchievers.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register-teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping
    public ResponseEntity<String> registerTeacher(@RequestBody TeacherRequest teacherRequest) {
        return teacherService.registerTeacher(teacherRequest);
    }

    @GetMapping
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.status(HttpStatus.OK).body("Hello World!!!");
    }

}
