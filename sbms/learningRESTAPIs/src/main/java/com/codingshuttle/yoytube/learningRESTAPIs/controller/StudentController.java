package com.codingshuttle.yoytube.learningRESTAPIs.controller;

import com.codingshuttle.yoytube.learningRESTAPIs.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto(4L, "Anuj", "anuj@gmail.com");
    }
}
