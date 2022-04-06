package com.bjpowernode.crm.web.controller;

import com.bjpowernode.crm.domain.User;
import com.bjpowernode.crm.service.Impl.UserServiceImpl;
import com.bjpowernode.crm.service.UserService;
import com.bjpowernode.crm.util.MD5Util;
import com.bjpowernode.crm.util.PrintJson;
import com.bjpowernode.crm.util.ServiceFactory;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UserController extends HttpServlet {
    private static Logger logger = Logger.getLogger(UserController.class);
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("进入用户控制器");
        String path = request.getServletPath();
        if(path.equals("/user/login.do")){
           login(request,response);
        }if (path.equals("/user/xxx.do")){

        }if(path.equals("/user/xxx.do")){

        }if(path.equals("/user/xxx.do")){

        }if(path.equals("/user/xxx.do")){

        }
    }

    private void login(HttpServletRequest request, HttpServletResponse response) {
        logger.debug("开始接受前面的参数");
        String loginAct = request.getParameter("loginAct");
        String loginPwd = request.getParameter("loginPwd");
        loginPwd = MD5Util.getMD5(loginPwd);
        //接收用户的ip地址
        String ip = request.getRemoteAddr();
        logger.debug("============"+ip);
        UserService userService = (UserService) ServiceFactory.getService(new UserServiceImpl());
        try {
            User user = userService.login(loginAct,loginPwd,ip);

            request.getSession().setAttribute("user",user);
            PrintJson.printJsonFlag(response,true);
        }catch (Exception e){
            e.printStackTrace();
            String msg  = e.getMessage();
            Map<String,Object> map =new HashMap<String, Object>();
            map.put("success",false);
            map.put("msg",msg);
            PrintJson.printJsonObj(response,map);
        }


    }
}
