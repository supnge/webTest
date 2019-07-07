package com.easygo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * cookies 记录上次访问时间
 */
//@WebServlet("/HelloServlet")
public class HelloServlet12 extends HttpServlet {

    /*请求重定向*/
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");

        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                String name = cookie.getName();

                if(name.equals("lastAccessTime")){
                    String value = cookie.getValue();

                    long time = Long.parseLong(value);

                    System.out.println("上次的访问时间："+ new Date(time));

                    resp.getWriter().write("上次的访问时间：<font color = 'red' >"+new Date(time)+"<font>");
                }
            }
        }
        Cookie cookie = new Cookie("lastAccessTime", System.currentTimeMillis()+"");
        cookie.setMaxAge(60*60);
        resp.addCookie(cookie);
    }


}
