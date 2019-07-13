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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User pageUser = new User(username, password, null, null);
        User user;
        try {
            user = userService.login(pageUser);

            if(null == user.getUsername()){
                response.getWriter().write("登录失败，3秒后返回登录页面");
                response.setHeader("refresh", "3;url="+request.getContextPath()+"/login.jsp");
            }else {
                request.getSession().setAttribute("loginUsername",user.getUsername());
                response.getWriter().write("登录成功，3秒后返回登录页面");
                response.setHeader("refresh", "3;url="+request.getContextPath()+"/main.jsp");
            }

        } catch (UserException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            request.setAttribute("exception", e);
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }
}