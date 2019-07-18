package com.easygo.dao.impl;

import com.easygo.dao.AccountDao;
import com.easygo.domain.Account;
import com.easygo.utils.DbUtils2;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.Connection;
import java.sql.SQLException;

public class AccountDaoImpl implements AccountDao {

    Connection connection = null;

    public AccountDaoImpl() {
    }

    public AccountDaoImpl(Connection connection) {
        this.connection = connection;
    }

    /**
     * 更新
     * @return
     */
    @Override
    public void updateAccount(Account account) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DbUtils2.getDataSource());
        queryRunner.update(connection, "update account set money = ? where name = ?", account.getMoney(), account.getName());
    }

    /**
     * 根据名字进行查询
     * @param name
     * @return
     * @throws SQLException
     */
    @Override
    public Account findAccount(String name) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DbUtils2.getDataSource());
        Account account = queryRunner.query(connection, "select * from account where name = ?", new BeanHandler<>(Account.class), name);
        return account;
    }

    /*
    //无事务
    @Override
    public void updateAccount(String from, String to, int money) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DbUtils2.getDataSource());
        queryRunner.update("update account set money = money-? where id = ?",money, from);
        queryRunner.update("update account set money = money+? where id = ?",money, to);
    }*/





}
