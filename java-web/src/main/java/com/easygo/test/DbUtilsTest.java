package com.easygo.test;

import com.easygo.domain.Account;
import com.easygo.utils.DbUtils2;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

public class DbUtilsTest {

    public void outPut(List list) {
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
            Account account = (Account) iterator.next();
            System.out.println(account.getId() + "--" + account.getName() + "--" + account.getMoney());
        }
    }

    public void outPut(int i) {
        System.out.println(i);
    }


    @Test
    public void test1() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DbUtils2.getDataSource());

        // 查询数据：
        List<Account> list = queryRunner.query("select * from account", new BeanListHandler<>(Account.class));

        outPut(list);
    }

    // 带参数的查询
    @Test
    public void test2() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DbUtils2.getDataSource());

        // 带参数查询：
        List<Account> list = queryRunner.query("select * from account where name=? and id =?", new BeanListHandler<>(Account.class), "aaa", 1);

        outPut(list);
    }

    // 插入数据
    @Test
    public void test3() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DbUtils2.getDataSource());

        // 带参数查询：
        int result = queryRunner.update("insert into account (name, money) values (?, ?)", "ddd", 4000);

        outPut(result);
    }

    // 删除
    @Test
    public void test4() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DbUtils2.getDataSource());

        // 带参数查询：
        int result = queryRunner.update("delete from account where id = ?", 4);

        outPut(result);
    }

    // 更新
    @Test
    public void test5() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DbUtils2.getDataSource());

        // 带参数查询：
        int result = queryRunner.update("update account set name=? ,money = ? where id=?", "aaaa", 1001, 1);

        outPut(result);
    }

    // ResultSet测试
    @Test
    public void test6() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DbUtils2.getDataSource());

        // 取一条记录
        /*Object[] objects = queryRunner.query("select * from account", new ArrayHandler());

        for(Object o: objects){
            System.out.println(o);
        }*/

        // 取多条记录
        /*List<Object[]> objects = queryRunner.query("select * from account", new ArrayListHandler());

        for (Object[] oj : objects) {
            for (Object o : oj) {
                System.out.println(o);
            }
        }*/

        // 取某一列记录
        /*List<Object> objects = queryRunner.query("select * from account", new ColumnListHandler(2));

        for (Object o : objects) {
            System.out.println(o);
        }*/

        // 取多条记录
        List<Object[]> objects = queryRunner.query("select * from account", new ArrayListHandler());

        for (Object[] oj : objects) {
            for (Object o : oj) {
                System.out.println(o);
            }
        }
    }
}
