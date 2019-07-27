package com.easygo.dao;

import com.easygo.domain.Book;
import com.easygo.domain.IBook;
import com.easygo.domain.PageResult;

import java.sql.SQLException;
import java.util.List;

public interface BookDao {
    public IBook findBookById(String id) throws SQLException;
    public List<IBook> findAllBooks() throws SQLException;
    public void addBook(IBook book);
    public void updateBook(IBook book);
    public void deleteBookById(String id);
    public List<IBook> findByCondition(String id, String category, String name, String lowPrice, String highPrice) throws SQLException;
    public PageResult<IBook> findBooksWithPageCount(int page) throws SQLException;
}
