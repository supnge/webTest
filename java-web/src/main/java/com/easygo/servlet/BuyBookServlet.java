package com.easygo.servlet;

import com.easygo.domain.Book;
import com.easygo.utils.DBUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Author:   supeng
 * Date:     2019-07-09 10:36
 * Description:  Buy
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@WebServlet("/BuyBookServlet")
public class BuyBookServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        // 1. 获取图书的ID
        String id = req.getParameter("id");
        Book book = DBUtils.findBookById(Integer.parseInt(id));
        // 2. 查看Session是否有购物车
        HttpSession session = req.getSession();
        List<Book> cart = (List<Book>) session.getAttribute("cart");
        // 如果为空，则新建一个 cart 如果不空，并且已有重复数据，删除原来的，添加新的
        if (cart == null) {
            cart = new ArrayList<Book>();
        } else {
            for(Book book1: cart){
                if (book1.getId() == Integer.parseInt(id)) {
                    cart.remove(book);
                    break;
                }
            }
//            System.out.println(cart.get(Integer.parseInt(id)));
        }

        // 3. 添加图书
        cart.add(book);

        // 4. 保存图书id到session中
        session.setAttribute("cart", cart);

        // 5. 显示购物车
        resp.getWriter().write("购物车中图书为：");
        resp.getWriter().write("<hr><br>图书列表：");
        for (Book book1 : cart) {
            resp.getWriter().write("书名：" + book1.getName() + "<br>");
        }


    }


}