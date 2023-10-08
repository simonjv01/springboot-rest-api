package com.example.springboot.controller;

import com.example.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

    // spring BOOT REST API with Path Variable
    // {id} - URI template variable
    // http://localhost:8080/students/1/simon/vargas
    @GetMapping("students/{id}/{first-name}/{last-name}")
    public Student studentPathVariable(@PathVariable("id") int studentId,
                                       @PathVariable("first-name") String firstName,
                                       @PathVariable("last-name") String lastName) {
        return new Student(studentId, firstName, lastName);
    }

    // spring boot REST API  with Request Param
    // http://localhost:8080/students/query?id=1&firsName=Simon&lastName=Vargas
    @GetMapping("students/query")
    public Student studentRequestVariable(@RequestParam int id,
                                          @RequestParam String firstName,
                                          @RequestParam String lastName) {
        return new Student(id, firstName, lastName);
    }

    // Spring boot REST API that handles HTTP POST Request
    // @PostMapping and @RequestBody

    
}
