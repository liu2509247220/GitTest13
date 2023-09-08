package com.ncit.springboot_test.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:user.properties")  // @PropertySource 注解作用：加载某个特定的配置文件
@ConfigurationProperties(prefix = "user")   // @ConfigurationProperties作用：批量注入配置文件中的值到属性中去
public class User {

    private  String  username;
    private  Integer age;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
