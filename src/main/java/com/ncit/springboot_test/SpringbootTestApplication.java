package com.ncit.springboot_test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication    // 这个注解代表当前类是主程序类
@ImportResource(locations = {"classpath:applicationContext.xml"})  //  将applicationContext.xml配置文件识别为Spring配置文件
@MapperScan("com.ncit.springboot_test.dao")  // 扫描所有dao层接口,在IOC容器中实例化相应对象
public class SpringbootTestApplication {

    public static void main(String[] args) {
        //  这里面 初始化化了Spring 容器 ，IOC容器
        SpringApplication.run(SpringbootTestApplication.class, args);
    }

}
