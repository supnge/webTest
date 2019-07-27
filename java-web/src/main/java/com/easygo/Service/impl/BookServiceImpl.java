package com.easygo.Service.impl;

import com.easygo.Service.BookService;
import com.easygo.dao.BookDao;
import com.easygo.dao.impl.BookDaoImpl;
import com.easygo.domain.IBook;
import com.easygo.domain.PageResult;
import sun.jvm.hotspot.debugger.Page;

import java.sql.SQLException;
import java.util.List;

public class BookServiceImpl implements BookService {

    BookDao bookDao = new BookDaoImpl();
    @Override
    public List<IBook> findAllBook() {
        try {
           return bookDao.findAllBooks();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void addBook(IBook book) {
        bookDao.addBook(book);
    }

    @Override
    public IBook findBookById(String id) throws SQLException {
        return bookDao.findBookById(id);
    }

    @Override
    public void updateBook(IBook book) {
        bookDao.updateBook(book);
    }

    @Override
    public void deleteBookById(String id) {
        bookDao.deleteBookById(id);
    }

    @Override
    public void deleteAllBooksServlet(String books) {
        if (books!="" && books!=null) {
            String[] bookIdArray = books.split(",");

            for(String bookId: bookIdArray){
                bookDao.deleteBookById(bookId);
            }
        }
    }

    @Override
    public List<IBook>  findBookByCondition(String id, String category, String name, String lowPrice, String highPrice) throws SQLException {
        return bookDao.findByCondition(id, category, name,lowPrice, highPrice);
    }

    @Override
    public PageResult<IBook> findBooksWithPageCount(int page) throws SQLException {
            return bookDao.findBooksWithPageCount(page);
    }
}
