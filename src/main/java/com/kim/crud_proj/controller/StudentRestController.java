package com.kim.crud_proj.controller;

import com.kim.crud_proj.domain.Student;
import com.kim.crud_proj.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentRestController {

    private final StudentService studentService;

    @GetMapping
    public List<Student> list() {

        return studentService.getAllStudents();
    }

}
