package com.kevinchege47.Spring.JPA.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@AttributeOverrides(
        {
                @AttributeOverride(
                        name = "name",
                        column = @Column(name = "guardian_name")

                ),
                @AttributeOverride(
                        name = "mobile",
                        column = @Column(name = "guardian_mobile")

                ),
                @AttributeOverride(
                        name = "email",
                        column = @Column(name = "guardian_email")

                )

        })
public class Guardian {
    private String name;
    private String email;
    private String mobile;
}
