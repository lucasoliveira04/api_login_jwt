package com.login_jwt.api_login_jwt.Services.auth;

import com.login_jwt.api_login_jwt.Dto.Auth.AuthEntityDto;
import com.login_jwt.api_login_jwt.Model.auth.AuthEntity;
import com.login_jwt.api_login_jwt.Model.register.RegisterEntity;
import com.login_jwt.api_login_jwt.Services.jwt.JwtFilter;
import com.login_jwt.api_login_jwt.repository.auth.AuthRepository;
import com.login_jwt.api_login_jwt.repository.register.RegisterRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;

@Service
public class AuthServices {

    private final AuthRepository authRepository;
    private final RegisterRepository registerRepository;
    private final JwtFilter jwtFilter;

    public AuthServices(AuthRepository authRepository, RegisterRepository registerRepository, JwtFilter jwtFilter) {
        this.authRepository = authRepository;
        this.registerRepository = registerRepository;
        this.jwtFilter = jwtFilter;
    }

    public AuthEntityDto getAuthEntity(String username, String password) {
        RegisterEntity registerEntity = registerRepository.findRegisterByUsername(username);

        if (registerEntity != null && registerEntity.getPassword() != null && password != null && registerEntity.getPassword().equals(password)) {
            AuthEntity authEntity = new AuthEntity();
            if (authEntity != null){
                authEntity.setCreatedAt(LocalDateTime.now());
                String token = jwtFilter.generateToken(username);
                authEntity.setToken(token);
                AuthEntity updatedAuthEntity = authRepository.save(authEntity);
                return AuthEntityDto.fromEntity(updatedAuthEntity);
            } else {
                // Se não existe uma entrada para este usuário, crie uma nova
                AuthEntity newAuthEntity = new AuthEntity();
                newAuthEntity.setCreatedAt(LocalDateTime.now());
                newAuthEntity.setRegister(registerEntity);
                String token = jwtFilter.generateToken(username);
                newAuthEntity.setToken(token);
                AuthEntity savedAuthEntity = authRepository.save(newAuthEntity);
                return AuthEntityDto.fromEntity(savedAuthEntity);
            }

        }
        throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Credenciais invalidas. Usuario não autorizado");
    }
}
