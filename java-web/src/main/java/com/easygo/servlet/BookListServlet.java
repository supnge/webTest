package com.easygo.servlet;

import com.easygo.Service.BookService;
import com.easygo.Service.impl.BookServiceImpl;
import com.easygo.domain.IBook;
import com.easygo.domain.PageResult;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/BookListServlet")
public class BookListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //查询所有数据：
        BookService bookService = new BookServiceImpl();
//        List<IBook> bookList = bookService.findAllBook();

        // 获取页码
        String page = req.getParameter("page");
        if (page == null || "".equals(page)) {
            page = "1";
        }

        //分页查询数据：
        try {
            PageResult<IBook> pageResult = bookService.findBooksWithPageCount(Integer.parseInt(page));
/*

            if(pageResult!=null){
                req.setAttribute("bookList", pageResult);
                req.getRequestDispatcher("/admin/products/list2.jsp").forward(req, resp);
            }
*/

            if (pageResult != null) {
                req.setAttribute("pageResult", pageResult);
                req.getRequestDispatcher("/admin/products/list2.jsp").forward(req, resp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
