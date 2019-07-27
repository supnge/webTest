package com.easygo.servlet;

import com.easygo.Service.IUserService;
import com.easygo.domain.User;
import com.easygo.exception.UserException;
import com.easygo.Service.impl.IUserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author:   supeng
 * Date:     2019-07-09 16:57
 * Description:  LoginServlet
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    IUserService userService = new IUserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println(username);
        System.out.println(password);

        if("zhangsan".equals(username) && "123".equals(password))
        {
            response.getWriter().write("成功");
        }
        else{
            response.getWriter().write("失败");
        }


    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

//        request.setCharacterEncoding("UTF-8");

        String username = request.getParameter("username2");
        String password = request.getParameter("password2");
        System.out.println(username);
        System.out.println(password);

        if("zhangsan".equals(username) && "123".equals(password))
        {
            response.getWriter().write("成功");
        }
        else{
            response.getWriter().write("失败");
        }
    }
}