package com.login_jwt.api_login_jwt.repository.register;

import com.login_jwt.api_login_jwt.Model.register.RegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepository extends JpaRepository<RegisterEntity, Long> {
}