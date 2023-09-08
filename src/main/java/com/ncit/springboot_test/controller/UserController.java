package com.ncit.springboot_test.controller;

import com.ncit.springboot_test.entity.User;
import com.ncit.springboot_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/doLogin")
    public User login(){
       return  userService.login("yxq", "123456");
    }

}
