package com.easygo.servlet;

import com.easygo.Service.IUserService;
import com.easygo.domain.User;
import com.easygo.serviceImpl.IUserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * Author:   supeng
 * Date:     2019-07-12 11:27
 * Description:  RegisterServlet
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class RegisterServlet extends HttpServlet {
    IUserService userService = new IUserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        User user = new User();

        try {
            ConvertUtils.register(new DateLocaleConverter(), Date.class);
            BeanUtils.populate(user, req.getParameterMap());

            userService.register(user);

            resp.getWriter().write("注册成功，3秒后返回主页");
            resp.setHeader("refresh", "3;url="+req.getContextPath()+"/index.jsp");

        } catch (Exception e) {
            e.printStackTrace();
            resp.getWriter().write("注册失败"+e.getMessage());
        }

    }
}