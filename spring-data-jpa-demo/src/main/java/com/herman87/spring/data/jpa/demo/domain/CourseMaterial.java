package com.herman87.spring.data.jpa.demo.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "t_course_material")
public class CourseMaterial {
    @Id
    @SequenceGenerator(
            name = "course_material_sequence",
            sequenceName = "course_material_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_material_sequence"
    )
    @Column(name = "c_id")
    private Long id;
    @Column(name = "c_url")
    private String url;
    @OneToOne(
            cascade = CascadeType.PERSIST,
            fetch = FetchType.LAZY,
            //to say the course is required when we want to persist a course
            optional = false
    )
    @JoinColumn(
            name = "c_course",
            referencedColumnName = "c_id"
    )
    private Course course;
}