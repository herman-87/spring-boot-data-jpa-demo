package com.herman87.spring.data.jpa.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CourseRepositoryTest {
    @Autowired
    private CourseRepository objectUnderTest;
}
