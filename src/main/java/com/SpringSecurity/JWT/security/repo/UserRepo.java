package com.SpringSecurity.JWT.security.repo;


import com.SpringSecurity.JWT.security.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity, Integer> {
    UserEntity findByUserName(String username);

}
