package com.ncit.springboot_test;

import com.ncit.springboot_test.controller.HelloController;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest  // 这个注解 代表这个类做单元测试
class SpringbootTestApplicationTests {

    @Autowired
    private HelloController helloController;

    @Autowired
    private DataSource dataSource;


    @Test
    public  void  testDataSource(){

        // com.alibaba.druid.pool.DruidDataSource
        System.out.println(dataSource.getClass());

    }


    @Ignore  // 当前的测试方法忽略
    @Test  // 这个方法参与单元测试
    public  void testHelloController(){
        System.out.println("====="+helloController.hello());
    }
}
