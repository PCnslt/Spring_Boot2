package com.tulesko.spring_sec_demo.controller;

import com.tulesko.spring_sec_demo.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {


    List<Student> students = new ArrayList<>(Arrays.asList(
             new Student(1,"John","Java"),
             new Student(2,"Mary","Python"),
             new Student(3,"Don","JavaScript")
     ));



     @GetMapping("csrf-token")
     public CsrfToken getCsrfToken(HttpServletRequest request){
         return (CsrfToken) request.getAttribute("_csrf");
     }

     @GetMapping("students")
    public ResponseEntity<List<Student>> getAllStudents(){
         return ResponseEntity.ok(students);
     }

     @PostMapping("student")
    public ResponseEntity<Student> addStudent(@RequestBody Student s){
         students.add(s);
         return ResponseEntity.ok(s);
     }




}
