package com.login_jwt.api_login_jwt.Model.register;

import com.login_jwt.api_login_jwt.Model.auth.AuthEntity;
import com.login_jwt.api_login_jwt.controller.AuthController;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "register_entity")
public class RegisterEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;
}