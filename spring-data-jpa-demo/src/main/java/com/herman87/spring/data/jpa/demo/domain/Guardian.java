package com.herman87.spring.data.jpa.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@AttributeOverrides({
        @AttributeOverride(
                name = "name",
                column = @Column(name = "c_guardian_name1")
        ),
        @AttributeOverride(
                name = "email",
                column = @Column(name = "c_guardian_email1")
        ),
        @AttributeOverride(
                name = "mobile",
                column = @Column(name = "c_guardian_mobile1")
        )
})
public class Guardian {
    private String name;
    private String email;
    private String mobile;
}
