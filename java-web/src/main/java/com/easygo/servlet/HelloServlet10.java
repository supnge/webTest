package com.easygo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/HelloServlet")
public class HelloServlet10 extends HttpServlet {

    /*请求转发*/
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {

        request.getRequestDispatcher("/index.jsp").forward(request, resp);
    }
}
