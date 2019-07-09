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
@WebServlet("/ShowAllBookServelt2")
public class ShowAllBookServelt2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("图书列表：<br>");

        Map<Integer, Book> bookMap = DBUtils.getAllBooks();

        for(Integer integer : bookMap.keySet()){
            Book book = bookMap.get(integer);
            String html = "<a href= '" + req.getContextPath() + "/BuyBookServlet?id=" + book.getId() + "'>" + book.getName() + "-点击购买</a><br>";
            resp.getWriter().write(html);
        }




    }
}