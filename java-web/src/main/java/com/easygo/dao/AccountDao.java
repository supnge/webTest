package com.easygo.dao;

import com.easygo.domain.Account;

import java.sql.SQLException;

public interface AccountDao {
//     void updateAccount(String from, String to, int money) throws SQLException;
     void updateAccount(Account account) throws SQLException;
     public Account findAccount(String name) throws SQLException;

}
