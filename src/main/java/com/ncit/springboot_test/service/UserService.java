package com.ncit.springboot_test.service;

import com.ncit.springboot_test.entity.User;

public interface UserService {

    public User login(String username, String pass);
}
