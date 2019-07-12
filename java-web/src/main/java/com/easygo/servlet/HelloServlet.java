package com.easygo.servlet;

import cn.dsna.util.images.ValidateCode;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * cookies 判断登录 ，jsp中记录用户名和checked
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {

    /*记住用户名*/
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String remember = request.getParameter("remember");
        System.out.println("username:"+username +"******"+ "password:"+ password);

        if("zhangsan".equals(username) && "123".equals(password)){
            Cookie cookie = new Cookie("username", username);
            cookie.setMaxAge(60*60);
            Cookie cookie1 = new Cookie("remember", remember);
            cookie1.setMaxAge(60*60);
            resp.addCookie(cookie);
            resp.addCookie(cookie1);
            resp.getWriter().write("登录成功！");
        }else{
            for(Cookie c: request.getCookies()){
                c.setMaxAge(0);
            }
            resp.getWriter().write("登录失败！");
        }
    }


}
