package com.herman87.spring.data.jpa.demo.repository;

import com.herman87.spring.data.jpa.demo.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
