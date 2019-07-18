package com.easygo.dao.impl;

import com.easygo.dao.BookDao;
import com.easygo.domain.Book;
import com.easygo.domain.IBook;
import com.easygo.utils.DbUtils2;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

public class BookDaoImpl implements BookDao {
    @Override
    public IBook findBookById(String id) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DbUtils2.getDataSource());
        return queryRunner.query("select * from books where id=?", new BeanHandler<>(IBook.class), id);
    }

    @Override
    public List<IBook> findAllBooks() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DbUtils2.getDataSource());
        return queryRunner.query("select * from books", new BeanListHandler<>(IBook.class));
    }

    @Override
    public void addBook(IBook book) {
        QueryRunner queryRunner = new QueryRunner(DbUtils2.getDataSource());
        try {
            queryRunner.update("insert into books values(?,?,?,?,?,?)", UUID.randomUUID().toString(), book.getName(),
                    book.getPrice(), book.getPnum(), book.getCategory(), book.getDescription());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateBook(IBook book) {
        QueryRunner queryRunner = new QueryRunner(DbUtils2.getDataSource());
        try {
            int result = queryRunner.update("update books set name=?, price=?, pnum=?, category=?, description=? where id=?",
                    book.getName(), book.getPrice(), book.getPnum(), book.getCategory(), book.getDescription(),book.getId());
            System.out.println("更新对象为："+book.getName()+" 更新结果为："+result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteBookById(String id) {
        QueryRunner queryRunner = new QueryRunner(DbUtils2.getDataSource());
        try {
            System.out.print("要删除图书为："+ findBookById(id).getName());
            int result = queryRunner.update("delete from books where id =?" , id);
            System.out.println("删除结果为："+result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<IBook> findByCondition(String id, String category, String name, String lowPrice,
                                       String highPrice) throws SQLException {
        String sql = "select * from books where 1=1";
        if(!"".equals(id)){
            sql = sql+  " and id like '%"+id+"%'";
        }
        if(!"".equals(category)){
            sql = sql+  " and category like '%"+category+"%'";
        }

        if(!"".equals(name)){
            sql = sql+  " and name  like '%"+name+"%'";
        }

        if(!"".equals(lowPrice)){
            sql = sql+  " and lowPrice >="+category+"";
        }

        if(!"".equals(highPrice)){
            sql = sql+  " and highPrice >="+highPrice+"";
        }

        QueryRunner queryRunner = new QueryRunner(DbUtils2.getDataSource());
        return queryRunner.query(sql, new BeanListHandler<>(IBook.class));
    }
}
