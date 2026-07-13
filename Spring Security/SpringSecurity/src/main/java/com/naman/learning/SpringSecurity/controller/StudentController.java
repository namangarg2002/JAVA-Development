package com.naman.learning.SpringSecurity.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naman.learning.SpringSecurity.model.Student;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Naman", 80),
            new Student(2, "Kiran", 90) 
    ));
    
    @GetMapping("/students")
    public List<Student> getStudent(){
        return students;
    }
}
