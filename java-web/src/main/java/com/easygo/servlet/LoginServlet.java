package com.easygo.servlet;

import cn.dsna.util.images.ValidateCode;
import com.easygo.Service.IUserService;
import com.easygo.domain.User;
import com.easygo.exception.UserException;
import com.easygo.serviceImpl.IUserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

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
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        User user = new User();

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        try {
            user = userService.login(username, password);
        } catch (UserException e) {
            e.printStackTrace();
        }

        if(user == null){
            resp.getWriter().write("登录失败，3秒后返回登录页面");
            resp.setHeader("refresh", "3;url="+req.getContextPath()+"/login.jsp");
        }else {
            req.getSession().setAttribute("loginUsername",user.getUsername());
            resp.getWriter().write("登录成功，3秒后返回登录页面");
            resp.setHeader("refresh", "3;url="+req.getContextPath()+"/main.jsp");
        }

    }
}