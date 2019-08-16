package com.training.RegistrationForm.entity;

import lombok.*;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "Users", uniqueConstraints={@UniqueConstraint(columnNames={"EMAIL"})})
public class User implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Long id;

    @Column(name = "FULL_NAME")
    private String fullName;

    @Column(name = "EMAIL")
    @NotNull
    private String email;

    @Column(name = "PASSWORD")
    @NotNull
    private String password;

    @Column(name = "ROLE")
    @NotNull
    Role role;

}
