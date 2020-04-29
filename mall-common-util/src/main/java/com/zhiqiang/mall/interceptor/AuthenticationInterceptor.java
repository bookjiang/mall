package com.zhiqiang.mall.interceptor;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhiqiang.mall.annotation.PassToken;
import com.zhiqiang.mall.annotation.UserLoginToken;
import com.zhiqiang.mall.bean.UmsAdmin;
import com.zhiqiang.mall.service.UmsAdminService;
import com.zhiqiang.mall.util.JwtTokenUtil;
import com.zhiqiang.mall.util.RedisUtil;
import io.jsonwebtoken.JwtException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @ClassName: tokenHeader
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/4/24 14:31
 */
public class AuthenticationInterceptor implements HandlerInterceptor {
    //@Reference
   // UmsAdminService umsAdminService;

    JwtTokenUtil jwtTokenUtil;
    @Autowired
    RedisUtil redisUtil;
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object object) throws Exception {
        String token = httpServletRequest.getHeader("token");// 从 http 请求头中取出 token
        // 如果不是映射到方法直接通过
        if (!(object instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) object;
        Method method = handlerMethod.getMethod();
        //检查是否有passtoken注释，有则跳过认证
        if (method.isAnnotationPresent(PassToken.class)) {
            PassToken passToken = method.getAnnotation(PassToken.class);
            if (passToken.required()) {
                return true;
            }
        }
        //检查有没有需要用户权限的注解
        if (method.isAnnotationPresent(UserLoginToken.class)) {
            UserLoginToken userLoginToken = method.getAnnotation(UserLoginToken.class);

            if (userLoginToken.required()) {
                // 执行认证
                if (token == null) {
                    throw new RuntimeException("无token，请重新登录");
                }else if (jwtTokenUtil.isTokenExpired(token))
                {
                    throw new RuntimeException("token已过期，请重新登录");
                }
                Jedis jedis= redisUtil.getJedis();
                String usename=jwtTokenUtil.getUserNameFromToken(token);
                String  token1;
                token1=jedis.get(usename);
                jedis.close();
                if (token1==null) {
                    throw new RuntimeException("无token，请重新登录");
                }

//                // 获取 token 中的 user id
//               // String userId;
//                try {
//                    //userId = JWT.decode(token).getAudience().get(0);
//                    //userId = jwtTokenUtil.getUserNameFromToken(token);
//                } catch (JwtException j) {
//                    throw new RuntimeException("401");
//                }
//                //UmsAdmin user = umsAdminService.findUserById(userId);
//                if (user == null) {
//                    throw new RuntimeException("用户不存在，请重新登录");
//                }
//                // 验证 token
//                JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(user.getPassword())).build();
//                try {
//                    jwtVerifier.verify(token);
//                } catch (JWTVerificationException e) {
//                    throw new RuntimeException("401");
//                }
                if(!token.equals(token1))
                {
                    throw new RuntimeException("token信息匹配错误，请重新登录");
                }


                return true;
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest,
                           HttpServletResponse httpServletResponse,
                           Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest,
                                HttpServletResponse httpServletResponse,
                                Object o, Exception e) throws Exception {
    }
}