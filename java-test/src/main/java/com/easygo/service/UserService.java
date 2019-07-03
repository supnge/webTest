package com.easygo.service;

import com.easygo.JDBC.DbUtils;
import com.easygo.bean.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Author:   supeng
 * Date:     2019-07-03 16:55
 * Description:  service
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class UserService {
    public User findUser(String username, String password){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DbUtils.getConnection();
            preparedStatement = connection.prepareStatement("select * from user where name=? and password=? ");

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            resultSet = preparedStatement.executeQuery();

            if(resultSet.first()){
                resultSet.last();

                System.out.println("查询结果集大小为："+ resultSet.getRow());

                resultSet.beforeFirst();
            }else {
                System.out.println("查询无结果");
            }

            User user = new User();

            while (resultSet.next()){
                user.setName(resultSet.getString(2));
                user.setPassword(resultSet.getString(3));
            }
            return user;


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            DbUtils.closeAll(connection, preparedStatement, resultSet);
        }


        return null;
    }
}