package com.herman87.spring.data.jpa.demo.repository;

import com.herman87.spring.data.jpa.demo.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
