package com.solomennicova.AuthTemplate.Dto.Authentication;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AuthenticationDto {

    @NotEmpty(message = "Имя не должно быть пустым")
    @Size(min = 2, max = 100, message = "Имя должно быть от 2 до 100 символов длиной")
    private String username;

    @NotEmpty(message = "Пароль не должно быть пустым")
    @Size(min = 2, max = 25, message = "Пароль должен быть от 2 до 25 символов длиной")
    private String password;

}
