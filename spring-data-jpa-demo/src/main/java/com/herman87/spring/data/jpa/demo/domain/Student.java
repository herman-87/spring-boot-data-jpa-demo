package com.herman87.spring.data.jpa.demo.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
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
    @Column(name = "c_id")
    private Long id;
    @Column(name = "c_firstname")
    private String firstname;
    @Column(name = "c_lastname")
    private String lastname;
    @Column(name = "c_email", nullable = false)
    private String email;
    @Embedded
    private Guardian guardian;
}
