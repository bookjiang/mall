package com.zhiqiang.mall.config;

import com.zhiqiang.mall.util.RedisUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: RedisConfig
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/4/24 11:05
 */
@Configuration
public class RedisConfig {

    //读取配置文件中的redis的ip地址
    @Value("${spring.redis.host:192.168.43.128}")
    private String host;

    @Value("${spring.redis.port:6379}")
    private int port;

    @Value("${spring.redis.database:0}")
    private int database;

    @Bean
    public RedisUtil getRedisUtil(){
        //System.out.println("aaaaa");
        if(host.equals("disabled")){
            //System.out.println("sdfsd");

            return null;
        }
        RedisUtil redisUtil=new RedisUtil();
        //System.out.println("host"+host+"port"+port+"database"+database);
        redisUtil.initPool(host,port,database);
        return redisUtil;
    }

}
