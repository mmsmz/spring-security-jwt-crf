package com.SpringSecurity.JWT.security.service;

import com.SpringSecurity.JWT.security.entity.UserEntity;
import com.SpringSecurity.JWT.security.model.UserPrinciples;
import com.SpringSecurity.JWT.security.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

public class MyUSerUserDetailsService implements UserDetailsService {


    @Autowired
    private UserRepo userRepo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserEntity user = userRepo.findByUserName(username);

        if(user==null){
            System.out.println("User Not Found");
            throw new UsernameNotFoundException("User Not Found");
        }
        return new UserPrinciples(user);
    }
}
