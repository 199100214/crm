package com.bjpowernode.crm.settings.service.Impl;

import com.bjpowernode.crm.settings.dao.UserDao;
import com.bjpowernode.crm.settings.domain.User;
import com.bjpowernode.crm.settings.exception.LoginException;
import com.bjpowernode.crm.settings.service.UserService;
import com.bjpowernode.crm.util.SqlSessionUtil;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {
    private UserDao userDao = SqlSessionUtil.getSqlSession().getMapper(UserDao.class);
    @Override
    public User login(String loginAct, String loginPwd, String ip) throws LoginException {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("loginAct",loginAct);
        map.put("loginPwd",loginPwd);
        User user = userDao.login(map);
        if (user == null){
            throw new LoginException("账号密码错误");
        }
        //程序进入到这 密码账户正确
        //验证是否失效
        String lockState = user.getLockState();
        String allowIps = user.getAllowIps();
        if ("0".equals(lockState)){
            throw new LoginException("账号锁定");

        }
        if (!allowIps.contains(ip)){
            throw new LoginException("ip受限");

        }
        return null;
    }
}
