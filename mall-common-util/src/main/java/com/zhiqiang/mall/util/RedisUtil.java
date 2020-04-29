package com.zhiqiang.mall.util;

import org.springframework.aop.scope.ScopedProxyUtils;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @ClassName: RedisUtil
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/4/24 11:04
 */

    public class RedisUtil {

        private JedisPool jedisPool;

        public void initPool(String host,int port ,int database){
            System.out.println("initpool"+host+" "+port+" "+database);
            JedisPoolConfig poolConfig = new JedisPoolConfig();
            poolConfig.setMaxTotal(200);
            //MaxIdle最大空闲时间，数据库连接的最大空闲时间。超过空闲时间，数据库连接将被标记为不可用，然后被释放。设为0表示无限制。
            poolConfig.setMaxIdle(30);
            poolConfig.setBlockWhenExhausted(true);
            //最大建立连接等待时间。如果超过此时间将接到异常。设为-1表示无限制。
            poolConfig.setMaxWaitMillis(10*1000);
            //#在borrow一个jedis实例时，是否提前进行validate操作；如果为true，则得到的jedis实例均是可用的；
            poolConfig.setTestOnBorrow(true);
            jedisPool=new JedisPool(poolConfig,host,port,20*1000);
            //System.out.println("成功");
            //System.out.println(jedisPool.toString());
        }

        public Jedis getJedis(){
            Jedis jedis = jedisPool.getResource();
            return jedis;
        }



}
