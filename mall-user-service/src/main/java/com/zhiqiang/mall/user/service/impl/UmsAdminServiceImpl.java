package com.zhiqiang.mall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.container.page.PageHandler;
import com.github.pagehelper.PageHelper;
import com.zhiqiang.mall.bean.UmsAdmin;
import com.zhiqiang.mall.bean.UmsAdminLogin;
import com.zhiqiang.mall.bean.UmsAdminLoginLog;
import com.zhiqiang.mall.commonbean.CommonResult;
import com.zhiqiang.mall.service.UmsAdminService;
import com.zhiqiang.mall.user.mapper.UmsAdminLoginLogMapper;
import com.zhiqiang.mall.user.mapper.UmsAdminMapper;
import com.zhiqiang.mall.util.JwtTokenUtil;
import com.zhiqiang.mall.util.RedisUtil;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: UmsAdminServiceImpl
 * @description: TODO
 * @author: zhiqiang
 * @create: 2020/4/21 23:38
 */
@Service
public class UmsAdminServiceImpl implements UmsAdminService {
    Map<String, String> tokenMap = new HashMap<>();
    private static final Logger LOGGER = LoggerFactory.getLogger(UmsAdminServiceImpl.class);

    @Autowired
    UmsAdminMapper umsAdminMapper;

    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();


    JwtTokenUtil jwtTokenUtil=new JwtTokenUtil();

    @Autowired
    UmsAdminLoginLogMapper umsAdminLoginLogMapper;

    @Autowired
    RedisUtil redisUtil;


/**
 * @description: 管理员注册，密码通过加密存入数据库中
 * @param:* @param umsAdmin
 * @return: int
 * @author: zhiqiang
 * @time: 2020/4/23 17:42
 */
    @Override
    public int register(UmsAdmin umsAdmin) {
        UmsAdmin umsAdmin1 = new UmsAdmin();

        umsAdmin1.setUsername(umsAdmin.getUsername());
        List<UmsAdmin> umsAdmins=umsAdminMapper.select(umsAdmin1);
        if(umsAdmins.size()>0)
        {
            return 1;
        }
        //将密码加密
       // System.out.println("ad"+umsAdmin.toString());
        String encodePassword=passwordEncoder.encode(umsAdmin.getPassword());
        umsAdmin.setPassword(encodePassword);
        umsAdminMapper.insert(umsAdmin);
        return 2;//成功插入


    }

    @Override
    public String login(String username, String password, Map tokenMap1) {
        tokenMap=tokenMap1;
        String token=null;
        //客户端加密密码传输
        try{
            UmsAdmin umsAdmin = new UmsAdmin();
            umsAdmin.setUsername(username);
            //System.out.println("0"+umsAdmin.toString());
            umsAdmin=umsAdminMapper.selectOne(umsAdmin);
           // System.out.println("1"+umsAdmin.toString());
            if(!passwordEncoder.matches(password,umsAdmin.getPassword())){
                throw new BadCredentialsException("密码不正确");
            }
            //System.out.println("umsAdmi"+umsAdmin.toString());
            token= jwtTokenUtil.generateToken(umsAdmin);
            insertLoginLog(umsAdmin);
        }
        catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
            throw new BadCredentialsException("登录异常，密码不正确");
        }

        //将token插入redis
        //redisUtil.initPool();
        Jedis jedis= redisUtil.getJedis();
        //System.out.println("username"+username);
        //System.out.println("token"+token);
        jedis.set(username,token);
        //jedis.expire(username,)
        jedis.close();
        return token;
    }

    @Override
    public UmsAdmin getAdminByUsername(String username) {
        UmsAdmin umsAdmin=new UmsAdmin();
        umsAdmin.setUsername(username);
        return umsAdminMapper.selectOne(umsAdmin);

    }

    @Override
    public String refreshToken(String token) {
        return jwtTokenUtil.refreshHeadToken(token);
    }

    @Override
    public UmsAdmin getItem(Long id) {
        return umsAdminMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UmsAdmin> list(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        UmsAdminExample
        return null;
    }

    /**
     * @description: 插入登录记录
     * @param:* @param username
     * @return: void
     * @author: zhiqiang
     * @time: 2020/4/24 19:07
     */
    private void insertLoginLog(UmsAdmin umsAdmin) {
        UmsAdminLoginLog umsAdminLoginLog=new UmsAdminLoginLog();
        umsAdminLoginLog.setAdminId(umsAdmin.getAdminId());
        umsAdminLoginLog.setCreateTime(new Date());
        //ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        //HttpServletRequest request = attributes.getRequest();
        umsAdminLoginLog.setIp(tokenMap.get("ip"));
        umsAdminLoginLog.setAddress(tokenMap.get("addr"));
        umsAdminLoginLog.setUserAgent(tokenMap.get("agent"));
        umsAdminLoginLogMapper.insert(umsAdminLoginLog);
    }


}
