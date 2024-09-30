package com.example.gestao_vagas.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CandidateEntity {

    private UUID id;
    private String name;

    @NotBlank()
    @Pattern(regexp = "\\S+", message = "O campo [username] não pode conter espaços")
    private String username;

    @Email(message = "O campo [email] deve conter um e-mail válido")
    private String email;

    @Length(min = 6, max = 20, message = "A senha deve ter no mínimo 6 caracteres, e no máximo 20.")
    private String password;
    private String description;
    private String curriculum;

        
}
