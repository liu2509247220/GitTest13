package com.ncit.springboot_test.config;

import com.ncit.springboot_test.service.UserService;
import com.ncit.springboot_test.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//  当项目中一定要用到Spring配置文件的时候，可以采用这种方式，@Configuration   +   @Bean
// SpringBoot推荐方式 ：

@Configuration   // 加了这个注解，这个类就相当于 Spring的配置文件
public class MyConfig {
    @Bean  // @Bean注解表示往IOC容器中 实例化了一个UserService类型的bean
    public UserService getUserService(){
        return new UserServiceImpl();
    }
}
