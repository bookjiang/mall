package com.zhiqiang.mall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
@MapperScan(basePackages = "com.zhiqiang.mall.user.mapper")
@ComponentScan({"com.zhiqiang.mall.config","com.zhiqiang.mall.product.config"})
public class MallProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductServiceApplication.class, args);
    }

}
