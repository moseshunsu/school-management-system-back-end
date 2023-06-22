package com.higherAchievers.controller;

import com.higherAchievers.dto.StudentRequest;
import com.higherAchievers.service.StudServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register-student")
public class StudController {

    @Autowired
    private StudServ studServ;

    @PostMapping
    public ResponseEntity<String> registerStudent(@RequestBody StudentRequest studentRequest) {
        return ResponseEntity.ok(studServ.registerStudent(studentRequest));
    }


}
