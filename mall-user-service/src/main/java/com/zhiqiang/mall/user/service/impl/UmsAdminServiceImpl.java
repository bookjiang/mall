package com.zhiqiang.mall.user.service.impl;

import cn.hutool.core.util.StrUtil;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiqiang.mall.bean.UmsAdmin;
import com.zhiqiang.mall.bean.UmsAdminExample;
import com.zhiqiang.mall.bean.UmsAdminLoginLog;
import com.zhiqiang.mall.service.UmsAdminService;
import com.zhiqiang.mall.user.mapper.UmsAdminLoginLogMapper;
import com.zhiqiang.mall.user.mapper.UmsAdminMapper;
import com.zhiqiang.mall.util.JwtTokenUtil;
import com.zhiqiang.mall.util.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.util.StringUtils;
import redis.clients.jedis.Jedis;

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
        //System.out.println(umsAdmin.getLoginTime());
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
            //System.out.println("0"+umsAdmin1.toString());
            //System.out.println("ps"+password);
            //umsAdmin=umsAdminMapper.se
            umsAdmin=umsAdminMapper.selectOne(umsAdmin);
            System.out.println("1"+umsAdmin.toString());
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

        //将token插入redis,后面可以考虑将admin直接插入redis，关键是怎么转回对象//TODO
        //redisUtil.initPool();
        //插入redis中
        Jedis jedis= redisUtil.getJedis();
        jedis.set(username,token);
        //设置过期时间，24小时
        jedis.expire(username,86400);
        jedis.close();  //用完还是需要关闭的

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
    public PageInfo<UmsAdmin> list(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        UmsAdminExample umsAdminExample = new UmsAdminExample();
        UmsAdminExample.Criteria criteria = umsAdminExample.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andUsernameLike("%" + keyword + "%");
            umsAdminExample.or(umsAdminExample.createCriteria().andNickNameLike("%" + keyword + "%"));
        }
        //脱离这个页面后pageInfo获取不到，故直接在这个页面获取返回即可
        List<UmsAdmin> list=umsAdminMapper.selectByExample(umsAdminExample);
        PageInfo<UmsAdmin> pageInfo = new PageInfo<UmsAdmin>(list);
        return pageInfo;
    }

    @Override
    public int update(Long id, UmsAdmin admin) {
        //UmsAdmin umsAdmin=umsAdminMapper.selectByPrimaryKey(id);
       // if(!passwordEncoder.matches(admin.getPassword(),umsAdmin.getPassword())){
        int count;
        if(StrUtil.isEmpty(admin.getPassword()))
        {
            //密码为空，则是更新状态信息
            count=umsAdminMapper.updateByPrimaryKeySelective(admin);
        }else {
            //直接将密码加密然后更新整个信息即可
            admin.setPassword(passwordEncoder.encode(admin.getPassword()));
            //}

            count = umsAdminMapper.updateByPrimaryKeySelective(admin);
        }
//        Jedis jedis= redisUtil.getJedis();
//        //让用户重新登录
//        jedis.del(String.valueOf(admin.getAdminId()));
//        jedis.close();  //用完还是需要关闭的
//TODO
        return count;
    }

    @Override
    public int delete(Long id) {
        int count=umsAdminMapper.deleteByPrimaryKey(id);
//        Jedis jedis= redisUtil.getJedis();
//        //让用户重新登录
//        jedis.del(String.valueOf(id));
//        jedis.close();  //用完还是需要关闭的
        //TODO
        return count;
    }

    @Override
    /**
     * @description: 更新用户登录时间，不用了，直接在insertLoginLog中调用即可
     * @param:* @param umsAdmin
     * @return: int
     * @author: zhiqiang
     * @time: 2020/5/2 10:54
     */
    public int updateByUserName(UmsAdmin umsAdmin) {
        return 0;
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
        umsAdminLoginLog.setAdminId(umsAdmin.getId());
        Date date=new Date();
        umsAdminLoginLog.setCreateTime(date);
        //ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        //HttpServletRequest request = attributes.getRequest();
        umsAdminLoginLog.setIp(tokenMap.get("ip"));
        umsAdminLoginLog.setAddress(tokenMap.get("addr"));
        umsAdminLoginLog.setUserAgent(tokenMap.get("agent"));
        umsAdminLoginLogMapper.insert(umsAdminLoginLog);
        //同时插入管理员表中的登录时间
        UmsAdmin umsAdmin1=new UmsAdmin();
        umsAdmin1.setId(umsAdmin.getId());
        umsAdmin1.setLoginTime(date);
        umsAdminMapper.updateByPrimaryKeySelective(umsAdmin1);
        //umsAdminMapper.updateByPrimaryK(umsAdmin1);这回导致将其他属性更新为null
    }


}
