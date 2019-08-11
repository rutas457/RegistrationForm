package com.training.RegistrationForm.dto;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class NoteDTO {
    private String fullName;
    private String email;
    private String phoneNumber;
}
