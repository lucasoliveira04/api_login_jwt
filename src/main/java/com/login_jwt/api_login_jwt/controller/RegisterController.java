package com.login_jwt.api_login_jwt.controller;

import com.login_jwt.api_login_jwt.Dto.Register.RegisterDto;
import com.login_jwt.api_login_jwt.Services.register.RegisterServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/register")
public class RegisterController {
    private final RegisterServices registerServices;

    public RegisterController(RegisterServices registerServices) {
        this.registerServices = registerServices;
    }

    @PostMapping("/add/register")
    public ResponseEntity<RegisterDto> create(@RequestBody RegisterDto registerDto) {
        RegisterDto savedRegister = registerServices.save(registerDto);
        return ResponseEntity.ok(savedRegister);
    }
}
