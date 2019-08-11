package com.training.RegistrationForm.entity;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class User {

    private Long id;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String login;
    private String password;

}
