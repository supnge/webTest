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
import java.sql.SQLException;
import java.util.List;

@WebServlet("/SearchBookServlet")
public class SearchBookServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        BookService bookService = new BookServiceImpl();

        String id = req.getParameter("id");
        String category = req.getParameter("category");
        String name = req.getParameter("name");
        String lowPrice = req.getParameter("minprice");
        String highPrice = req.getParameter("maxprice");

        try {
            List<IBook> bookList =  bookService.findBookByCondition(id, category,name, lowPrice, highPrice);

            req.setAttribute("bookList", bookList);
            req.getRequestDispatcher("/admin/products/list.jsp").forward(req, resp);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
