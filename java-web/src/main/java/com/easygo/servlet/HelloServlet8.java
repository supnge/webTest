package com.easygo.servlet;

import com.easygo.domain.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/HelloServlet")
public class HelloServlet8 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        //post请求时，中文会乱码,解决方法setCharacterEncoding,只针对post请求有效
        request.setCharacterEncoding("UTF-8");

        // 通过beanutils来封装请求参数
        User user = new User();

        try{
            BeanUtils.populate(user, request.getParameterMap());
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(user);

        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getGender());
        System.out.println(user.getRemark());
    }
}
