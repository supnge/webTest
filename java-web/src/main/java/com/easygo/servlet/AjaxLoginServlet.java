package com.easygo.servlet;

import org.codehaus.jackson.map.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/AjaxLoginServlet")
public class AjaxLoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println("接收到的信息为：username: "+ username +" password: "+ password);

        // 无json
        /*
        if("zhangsan".equals(username)&& "123".equals(password)){
            resp.getWriter().write("success");
        }else {
            resp.getWriter().write("failure");
        }
        */

        // 有json
        ObjectMapper mapper = new ObjectMapper();
        Map<String, String > stringMap = new HashMap<>();
        if("zhangsan".equals(username)&& "123".equals(password)){
            stringMap.put("success", "1");
            stringMap.put("message", "");
        }else {
            stringMap.put("success", "0");
            stringMap.put("message", "用户名或者密码不对");
        }

        // 响应
        resp.getWriter().write(mapper.writeValueAsString(stringMap));

    }
}
