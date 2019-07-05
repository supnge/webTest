package com.easygo.servlet;

import javax.servlet.*;
import java.io.IOException;

public class HelloServlet2 implements Servlet {

    public HelloServlet2(){
        System.out.println("HelloServlet()");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service ...");
        servletResponse.getWriter().write("hello");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
