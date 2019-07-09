package com.easygo.servlet;

import com.easygo.bean.Book;
import com.easygo.utils.DBUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Author:   supeng
 * Date:     2019-07-08 11:12
 * Description:  ViewBookServlet
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@WebServlet("/ViewBookServlet")
public class ViewBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String vId = req.getParameter("id");
//        System.out.println("vId: "+ vId);
        Book book = DBUtils.findBookById(Integer.parseInt(vId));

        resp.getWriter().write("查看书的详细信息："+book.toString());

        Cookie[] cookies = req.getCookies();

        // 无cookies 时：
        if(cookies ==null){
            Cookie cookie = new Cookie("historyBookId", vId);
            cookie.setMaxAge(60*60);
            resp.addCookie(cookie);
            return;
        }
        // 存cookies
        for(Cookie cookie :cookies){
            List<String> idList = new ArrayList<>();
            String[] ids = cookie.getValue().split("-");

            for(String id:ids){
                idList.add(id);
            }
//            System.out.println("old:"+idList);

            // 如果存在id，则删除，如果不存在，则添加
            idList.remove(vId);
            idList.add(vId);

//            System.out.println("new: "+idList);

            StringBuffer stringBuffer = new StringBuffer();
            for(String nId: idList){
                stringBuffer.append(nId+"-");
            }

            Cookie newCook =new Cookie("historyBookId", stringBuffer.substring(0, stringBuffer.length()-1));
            newCook.setMaxAge(60*60);
            resp.addCookie(newCook);
            return;
        }
    }
}