package com.easygo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

//@WebServlet("/HelloServlet")
public class HelloServlet6 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String gender = req.getParameter("gender");
        String[] hobby = req.getParameterValues("hobby");
        String remark = req.getParameter("remark");

        System.out.println(username);
        System.out.println(password);
        System.out.println(gender);
        System.out.println(Arrays.toString(hobby));
        System.out.println(remark);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        req.setCharacterEncoding("UTF-8");
//
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//        String gender = req.getParameter("gender");
//        String[] hobby = req.getParameterValues("hobby");
//        String remark = req.getParameter("remark");
//
//        System.out.println(username);
//        System.out.println(password);
//        System.out.println(gender);
//        System.out.println(Arrays.toString(hobby));
//        System.out.println(remark);
    }
}
