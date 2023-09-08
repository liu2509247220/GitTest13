package com.ncit.springboot_test.controller;

import com.ncit.springboot_test.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController  // @RestController  = @Controller + @ResponseBody注解
public class HelloController {

    @Value("${username}")
    private  String username;

    @Autowired
    private  User user;

    @RequestMapping("/hello")
    public  String   hello(){
        return "hello333333";
    }

    @RequestMapping("/getUserName")
    public  String getUserName(){
        return  username;
    }

    @RequestMapping("/getUser")
    public  User getUser(){
        return  user;
    }


}
