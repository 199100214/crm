package com.bjpowernode.crm.web.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("进入用户控制器");
        String path = request.getServletPath();
        if(path.equals("/user/xxx.do")){
           // xxx(request,response);
        }if (path.equals("/user/xxx.do")){

        }if(path.equals("/user/xxx.do")){

        }if(path.equals("/user/xxx.do")){

        }if(path.equals("/user/xxx.do")){

        }
    }
}