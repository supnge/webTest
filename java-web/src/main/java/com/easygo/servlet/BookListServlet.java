package com.easygo.servlet;

import com.easygo.Service.BookService;
import com.easygo.Service.impl.BookServiceImpl;
import com.easygo.domain.IBook;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/BookListServlet")
public class BookListServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //查询所有数据：
        BookService bookService = new BookServiceImpl();
        List<IBook> bookList = bookService.findAllBook();

        if(bookList !=null){
            req.setAttribute("bookList", bookList);
            req.getRequestDispatcher("/admin/products/list.jsp").forward(req, resp);
        }
    }
}
