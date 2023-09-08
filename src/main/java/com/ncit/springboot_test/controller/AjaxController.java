package com.ncit.springboot_test.controller;

import com.ncit.springboot_test.entity.User;
import org.springframework.web.bind.annotation.*;

// 全部返回数据而不是视图名称
@RestController   // @RestController =  @Controller + @ResponseBody
@CrossOrigin(origins = "*")  // 解决跨域请求
public class AjaxController {

    @RequestMapping("/helloAjax")
    public  String   helloAjax(@RequestParam("username") String username){
        return username;
    }

    @RequestMapping("/helloAjax2")
    public User helloAjax2(@RequestParam("username") String username){
        User user =new User();
        user.setUsername(username);
        user.setAge(18);
        return user;
    }

    @PostMapping("/doRegister")
    public String register(@RequestParam("uName") String username,
                           @RequestParam("password") String password){
        User user =new User();
        user.setUsername(username);
        user.setAge(18);
        System.out.println(user);
        return "success";
    }
}
