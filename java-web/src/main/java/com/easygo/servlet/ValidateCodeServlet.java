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
 * Date:     2019-07-09 15:42
 * Description:  validateCode
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@WebServlet("/ValidateCodeServlet")
public class ValidateCodeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        //创建一个验证码：
        ValidateCode validateCode = new ValidateCode(120, 30, 4, 4);

        //验证码存入session
        req.getSession().setAttribute("validateCode", validateCode);

        validateCode.write(resp.getOutputStream());
    }
}