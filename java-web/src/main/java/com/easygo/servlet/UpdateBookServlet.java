package com.easygo.servlet;

import com.easygo.Service.BookService;
import com.easygo.Service.impl.BookServiceImpl;
import com.easygo.domain.IBook;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@WebServlet("/UpdateBookServlet")
public class UpdateBookServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        IBook book = new IBook();
        BookService bookService = new BookServiceImpl();
        try {
            BeanUtils.populate(book, req.getParameterMap());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("要个性的图书为："+ book.getName());
        bookService.updateBook(book);

        //跳转
        req.setAttribute("bookList", bookService.findAllBook());
        req.getRequestDispatcher("/admin/products/list.jsp").forward(req, resp);
    }
}
