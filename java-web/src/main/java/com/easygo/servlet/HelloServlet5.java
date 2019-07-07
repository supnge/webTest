package com.easygo.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

public class HelloServlet5 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> enumeration = req.getHeaderNames();

        /*getRequestURL方法返回客户端发出请求时的完整URL。
        getRequestURI方法返回请求行中的资源名部分。
        getQueryString 方法返回请求行中的参数部分。
        getRemoteAddr方法返回发出请求的客户机的IP地址
                getRemoteHost方法返回发出请求的客户机的完整主机名
        getRemotePort方法返回客户机所使用的网络端口号
        getLocalAddr方法返回WEB服务器的IP地址。
        getLocalName方法返回WEB服务器的主机名
                getMethod得到客户机请求方式*/

        System.out.println(req.getRequestURL());
        System.out.println(req.getRequestURI());
        System.out.println(req.getQueryString());
        System.out.println(req.getRemoteAddr());
        System.out.println(req.getRemoteHost());
        System.out.println(req.getRemotePort());
        System.out.println(req.getLocalAddr());
        System.out.println(req.getLocalName());
        System.out.println(req.getMethod());
        System.out.println("==================");


        while (enumeration.hasMoreElements())
        {
            String name = enumeration.nextElement();
            System.out.println(name+":"+req.getHeader(name));
        }

        System.out.println("=================");

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println(username +":"+password);

        String[] values = req.getParameterValues("username");
        System.out.println(Arrays.toString(values));


        Enumeration<String> enumeration1 = req.getParameterNames();
        while (enumeration1.hasMoreElements()){
            String name = enumeration1.nextElement();

            System.out.println(name);
        }

        Map<String, String[]> map =  req.getParameterMap();

        for(Iterator iterator = map.keySet().iterator(); iterator.hasNext();){
            String key = (String)iterator.next();
            System.out.println(key+":"+ Arrays.toString(map.get(key)));
        }



    }
}
