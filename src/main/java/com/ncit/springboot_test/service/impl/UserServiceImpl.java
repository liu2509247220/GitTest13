package com.ncit.springboot_test.service.impl;

import com.ncit.springboot_test.entity.User;
import com.ncit.springboot_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class UserServiceImpl implements UserService {
    @Autowired
    private  User user;
    @Override
    public User login(String username, String pass) {
        return user;
    }
}
