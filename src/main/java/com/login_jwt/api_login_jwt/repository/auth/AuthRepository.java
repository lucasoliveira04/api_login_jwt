package com.login_jwt.api_login_jwt.repository.auth;

import com.login_jwt.api_login_jwt.Model.auth.AuthEntity;
import com.login_jwt.api_login_jwt.Model.register.RegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<AuthEntity, Long> {

}