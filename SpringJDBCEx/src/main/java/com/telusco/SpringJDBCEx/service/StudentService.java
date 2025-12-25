package com.telusco.SpringJDBCEx.service;

import com.telusco.SpringJDBCEx.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public void addStudent(Student s) {
        System.out.println("Added");
    }
}
