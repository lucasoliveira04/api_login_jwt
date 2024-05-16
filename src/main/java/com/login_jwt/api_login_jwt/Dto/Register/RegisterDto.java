package com.login_jwt.api_login_jwt.Dto.Register;

import com.login_jwt.api_login_jwt.Dto.Auth.AuthEntityDto;
import com.login_jwt.api_login_jwt.Model.auth.AuthEntity;
import com.login_jwt.api_login_jwt.Model.register.RegisterEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.login_jwt.api_login_jwt.Model.register.RegisterEntity}
 */
@Getter @Setter
public class RegisterDto implements Serializable {
    private Long id;
    private String username;
    private String password;

    public static RegisterDto fromEntityDataRegister(RegisterEntity register) {
        RegisterDto dto = new RegisterDto();
        dto.setId(register.getId());
        dto.setUsername(register.getUsername());
        dto.setPassword(register.getPassword());
        return dto;
    }
}