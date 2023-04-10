package com.herman87.spring.data.jpa.demo.repository;

import com.herman87.spring.data.jpa.demo.domain.Course;
import com.herman87.spring.data.jpa.demo.domain.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CourseMaterialRepositoryTest {
    @Autowired
    private CourseMaterialRepository objectUnderTest;
    @Autowired
    private CourseRepository courseRepository;

    @Test
    void saveCourseMaterialTest() {
        final var course = Course.builder()
                .title("title")
                .credit(6L)
                .build();
        objectUnderTest.save(CourseMaterial.builder()
                        .course(course)
                        .url("www.google.com")
                .build());
    }
}
