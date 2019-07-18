package com.easygo.Service.impl;

import com.easygo.Service.AccountService;
import com.easygo.dao.AccountDao;
import com.easygo.dao.impl.AccountDaoImpl;
import com.easygo.domain.Account;
import com.easygo.utils.DbUtils2;

import java.sql.Connection;
import java.sql.SQLException;

public class AccountServiceImpl implements AccountService {
    AccountDao accountDao = new AccountDaoImpl();

    /**
     * 添加事务，进行处理
     * @param from
     * @param to
     * @param amount
     * @throws SQLException
     */
    @Override
    public void transfer(String from, String to, int amount) throws Exception {
        Connection connection = DbUtils2.getConnection();
        AccountDao accountDao = new AccountDaoImpl(connection);
        try {
            connection.setAutoCommit(false);

            Account fromAccount = accountDao.findAccount(from);
            Account toAccount = accountDao.findAccount(to);

            fromAccount.setMoney(fromAccount.getMoney()-amount);
            toAccount.setMoney(toAccount.getMoney()+amount);

            accountDao.updateAccount(fromAccount);
//            int i = 10/0;
            accountDao.updateAccount(toAccount);

            connection.commit();

        }catch (Exception e){
            e.printStackTrace();
            connection.rollback();
        }finally {
            connection.close();
        }
    }

    /**
     * 无事务的数据处理
     * @param from
     * @param to
     * @param amount
     * @throws SQLException
     */
    /*
    @Override
    public void transfer(String from, String to, int amount) throws SQLException {
        accountDao.updateAccount(from,to,amount);
    }
    */


}
