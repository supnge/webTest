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
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Author:   supeng
 * Date:     2019-07-08 10:15
 * Description:  showAllBookServelt
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@WebServlet("/ShowAllBookServelt")
public class ShowAllBookServelt extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("图书列表：<br>");

        System.out.println("列表大小：" + DBUtils.getAllBooks().entrySet().size());
        System.out.println("路径：" + req.getContextPath());
        for (Map.Entry<Integer, Book> entry : DBUtils.getAllBooks().entrySet()) {
            Book book = entry.getValue();
            System.out.println(book.getId() + ":" + book.getName());
            String html = "<a href= '" + req.getContextPath() + "/ViewBookServlet?id=" + book.getId() + "'>" + book.getName() + "</a><br>";
            resp.getWriter().write(html);
        }

        resp.getWriter().write("已浏览图书");
        Cookie[] cookies = req.getCookies();

        for (Cookie cookie : cookies) {
            //对于已有cookie
            if (cookie.getName().equals("historyBookId")) {
                System.out.println(cookie.getValue());
                String[] ids = cookie.getValue().split("-");
                for (String str : ids) {
                    if (Pattern.compile("[0-9]*").matcher(str).matches()) {
                        Book book = DBUtils.findBookById(Integer.parseInt(str));
                        String html = "<br><a href= '" + req.getContextPath() + "/ViewBookServlet?id=" + book.getId() + "'>" + book.getName() + "</a><br>";
                        resp.getWriter().write(html);
                    }
                }
                // 直接判断 ：
                /*if(ids.length>1){
                    Book book=DBUtils.findBookById(Integer.parseInt(ids[1]));
                    String html = "<br><a href= '" + req.getContextPath() + "/ViewBookServlet?id=" + book.getId() + "'>" + book.getName() + "</a><br>";
                    resp.getWriter().write(html);
                }
*/

            }
        }

    }
}