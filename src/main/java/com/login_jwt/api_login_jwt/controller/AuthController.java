package com.login_jwt.api_login_jwt.controller;

import com.login_jwt.api_login_jwt.Dto.Auth.AuthEntityDto;
import com.login_jwt.api_login_jwt.Model.auth.AuthEntity;
import com.login_jwt.api_login_jwt.Model.register.RegisterEntity;
import com.login_jwt.api_login_jwt.Services.auth.AuthServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/auth")
public class AuthController {
    private final AuthServices authServices;

    public AuthController(AuthServices authServices) {
        this.authServices = authServices;
    }

    @PostMapping("/")
    public ResponseEntity<?> login(@RequestBody RegisterEntity request){
        String username = request.getUsername();
        String password = request.getPassword();

        AuthEntityDto authEntity = authServices.getAuthEntity(username, password);

        if (authEntity != null) {
            return ResponseEntity.ok(authEntity.getToken());
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}
