package com.login_jwt.api_login_jwt.Dto.Auth;

import com.login_jwt.api_login_jwt.Dto.Register.RegisterDto;
import com.login_jwt.api_login_jwt.Model.auth.AuthEntity;
import com.login_jwt.api_login_jwt.Model.register.RegisterEntity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
public class AuthEntityDto implements Serializable {
    private Long id;
    private LocalDateTime createdAt;
    private RegisterDto register;

    public static AuthEntityDto fromEntity(AuthEntity authEntity) {
        AuthEntityDto dto = new AuthEntityDto();
        dto.setId(authEntity.getId());
        dto.setCreatedAt(authEntity.getCreatedAt());
        if (authEntity.getRegister() != null) {
            RegisterEntity registerEntity = authEntity.getRegister();
            dto.setRegister(RegisterDto.fromEntityDataRegister(registerEntity));
        }
        return dto;
    }
}
