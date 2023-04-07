package com.herman87.spring.data.jpa.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
    @Embedded
    private Guardian guardian;
}
