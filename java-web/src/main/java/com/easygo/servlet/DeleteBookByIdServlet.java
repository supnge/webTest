package com.easygo.servlet;

import com.easygo.Service.BookService;
import com.easygo.Service.impl.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DeleteBookByIdServlet")
public class DeleteBookByIdServlet extends HelloServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BookService bookService = new BookServiceImpl();

        req.setCharacterEncoding("UTF-8");

        bookService.deleteBookById(req.getParameter("id"));

        req.setAttribute("bookList", bookService.findAllBook());
        req.getRequestDispatcher("/admin/products/list.jsp").forward(req, resp);

    }
}
