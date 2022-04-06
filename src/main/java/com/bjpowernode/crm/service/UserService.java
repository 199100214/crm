package com.bjpowernode.crm.service;

import com.bjpowernode.crm.domain.User;
import com.bjpowernode.crm.exception.LoginException;

public interface UserService {
    User login(String loginAct, String loginPwd, String ip) throws LoginException;
}
