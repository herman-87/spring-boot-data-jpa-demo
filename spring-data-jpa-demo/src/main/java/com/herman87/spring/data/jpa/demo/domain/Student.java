package com.herman87.spring.data.jpa.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(
        name = "t_student",
        uniqueConstraints = @UniqueConstraint(
                name = "email_is_unique",
                columnNames = "c_email"
        )
)
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String firstname;
    private String lastname;
    @Column(name = "c_email", nullable = false)
    private String email;
    private String guardianName;
    private String guardianEmail;
    private String guardianMobile;
}
