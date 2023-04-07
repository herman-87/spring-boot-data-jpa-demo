package com.herman87.spring.data.jpa.demo.repository;

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
        studentRepository.save(
                Student.builder()
                        .email("student4@email.com")
                        .firstname("student1 firstname")
                        .lastname("student1 lastname")
                        .guardianMobile("677777777")
                        .guardianEmail("student1_guardian@email.com")
                        .guardianName("student1 guardian name")
                        .build()
        );
    }
}