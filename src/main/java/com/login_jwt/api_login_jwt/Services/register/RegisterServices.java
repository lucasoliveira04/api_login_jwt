package com.login_jwt.api_login_jwt.Services.register;

import com.login_jwt.api_login_jwt.Dto.Register.RegisterDto;
import com.login_jwt.api_login_jwt.Model.register.RegisterEntity;
import com.login_jwt.api_login_jwt.repository.register.RegisterRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegisterServices {
    private final RegisterRepository registerRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public RegisterServices(RegisterRepository registerRepository, BCryptPasswordEncoder passwordEncoder) {
        this.registerRepository = registerRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public RegisterDto save(RegisterDto registerDto) {

        if (registerRepository.existsByUsername(registerDto.getUsername())){
            throw new RuntimeException("Username already exists");
        }
        RegisterEntity entity = new RegisterEntity();

        entity.setUsername(registerDto.getUsername());

        String passwordBcrypt = passwordEncoder.encode(registerDto.getPassword());
        entity.setPassword(passwordBcrypt);

        RegisterEntity savedEntity = registerRepository.save(entity);

        return RegisterDto.fromEntityDataRegister(savedEntity);
    }
}
