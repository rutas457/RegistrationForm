package com.training.RegistrationForm.dto;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class UserDTO {

    @NotNull
    @Size(min=2, max=30)
    private String email;

    @NotNull
    private String password;
}
