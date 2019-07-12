package com.easygo.servlet;

import cn.dsna.util.images.ValidateCode;

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
//@WebServlet("/LoginServlet")
public class LoginServlet_bak extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String clntCode = req.getParameter("clientCode");

        //判断验证码：
        ValidateCode validateCode = (ValidateCode) req.getSession().getAttribute("validateCode");
        if (validateCode != null) {
            System.out.println(validateCode.getCode());
            String serverCode = ((ValidateCode) req.getSession().getAttribute("validateCode")).getCode();

            if (!clntCode.equalsIgnoreCase(serverCode)) {
                resp.getWriter().write("验证码错误，请刷新界面");
            }

            // 判断登录：
            if ("zhangsan".equals(username) && "123".equals(password)) {
                resp.getWriter().write("登录成功");
            } else {
                resp.getWriter().write("登录失败");
            }
        } else {
            resp.getWriter().write("验证码有误，请刷新界面");
        }


        //删除session中的数据
        req.getSession().invalidate();


    }
}