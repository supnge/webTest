package com.easygo.Service;

import com.easygo.domain.IBook;
import com.easygo.domain.PageResult;
import org.apache.ibatis.session.SqlSessionException;

import java.sql.SQLException;
import java.util.List;

public interface BookService {
    public List<IBook> findAllBook();
    public void addBook(IBook book);
    public IBook findBookById(String id) throws SQLException;
    public void updateBook(IBook book);
    public void deleteBookById(String id);
    public void deleteAllBooksServlet(String books);
    public List<IBook>  findBookByCondition(String id, String category, String name, String lowPrice, String highPrice) throws SQLException;
    public PageResult<IBook> findBooksWithPageCount(int page) throws SQLException;
}
