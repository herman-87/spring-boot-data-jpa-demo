package com.herman87.spring.data.jpa.demo.repository;

import com.herman87.spring.data.jpa.demo.domain.Guardian;
import com.herman87.spring.data.jpa.demo.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    void saveStudentTest() {
        Guardian guardian = new Guardian(
                "student1 guardian name",
                "student1_guardian@email.com",
                "677777777"
        );
        studentRepository.save(
                Student.builder()
                        .email("student1@email.com")
                        .firstname("student1 firstname")
                        .lastname("student1 lastname")
                        .guardian(guardian)
                        .build()
        );
    }
}