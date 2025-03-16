package com.SpringSecurity.JWT.security.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/")
    public String greet(HttpServletRequest httpServletRequest){
        return "Welcome to Mohamed website" + httpServletRequest.getSession().getId();
    }


}
