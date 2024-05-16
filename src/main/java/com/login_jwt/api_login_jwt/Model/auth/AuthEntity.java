package com.login_jwt.api_login_jwt.Model.auth;

import com.login_jwt.api_login_jwt.Model.register.RegisterEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "auth_entity")
public class AuthEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "creadAt")
    private LocalDateTime createdAt;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "register_id", referencedColumnName = "id")
    private RegisterEntity register;
}