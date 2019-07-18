package com.easygo.servlet;

import com.easygo.Service.BookService;
import com.easygo.Service.impl.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DeleteAllBooksServlet")
public class DeleteAllBooksServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BookService bookService = new BookServiceImpl();
        String bookIds = req.getParameter("ids");
        System.out.println("删除的图书为："+bookIds);

        // 删除
        bookService.deleteAllBooksServlet(bookIds);
        // 转发
        req.setAttribute("bookList", bookService.findAllBook());
        req.getRequestDispatcher("/admin/products/list.jsp").forward(req, resp);
    }
}
