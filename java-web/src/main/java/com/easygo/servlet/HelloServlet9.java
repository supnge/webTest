package com.easygo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;

//@WebServlet("/HelloServlet")
public class HelloServlet9 extends HttpServlet {

    /*通过InputStream来获取最原始的表单数据*/
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        //post请求时，中文会乱码,解决方法setCharacterEncoding,只针对post请求有效
        request.setCharacterEncoding("UTF-8");

        InputStream inputStream = request.getInputStream();

        byte[] bytes = new byte[1023];
        int len =0;

        while ((len = inputStream.read(bytes))!=-1){
            String str = new String(bytes, 0, len, "UTF-8");
            System.out.println(str);

            str = URLDecoder.decode(str, "UTF-8");
            System.out.println(str);

        }

    }
}
