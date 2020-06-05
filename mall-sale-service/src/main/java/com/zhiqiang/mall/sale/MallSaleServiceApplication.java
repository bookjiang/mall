package com.zhiqiang.mall.sale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
@MapperScan({"com.zhiqiang.mall.user.mapper","com.zhiqiang.mall.sale.dao"})
public class MallSaleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallSaleServiceApplication.class, args);
    }

}
