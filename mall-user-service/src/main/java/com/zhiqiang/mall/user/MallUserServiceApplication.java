package com.zhiqiang.mall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.context.request.RequestContextListener;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
@MapperScan(basePackages = "com.zhiqiang.mall.user.mapper")
@ComponentScan({"com.zhiqiang.mall.config","com.zhiqiang.mall.user.config"})
public class MallUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallUserServiceApplication.class, args);
    }

}
