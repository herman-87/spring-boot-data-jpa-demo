package com.herman87.spring.data.jpa.demo.controller;

import com.herman87.spring.data.jpa.demo.domain.Student;
import com.herman87.spring.data.jpa.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/")
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.status(OK).body(
                studentRepository.findAll()
        );
    }
}
