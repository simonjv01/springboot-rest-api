package com.example.springboot.controller;

import com.example.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("student")
    public Student getStudent() {
        return new Student(
                1, "Simon","Vargas"
        );
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Simon", "Vargas"));
        studentList.add(new Student(2, "Steve", "Thomas"));
        studentList.add(new Student(3, "Jill", "Logan"));
        return studentList;
    }
}
