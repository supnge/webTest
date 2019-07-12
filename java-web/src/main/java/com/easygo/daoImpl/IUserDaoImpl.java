package com.easygo.daoImpl;

import com.easygo.dao.IUserDao;
import com.easygo.domain.User;
import com.easygo.utils.DbUtils2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Author:   supeng
 * Date:     2019-07-12 10:51
 * Description:  impl
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class IUserDaoImpl implements IUserDao {
    @Override
    public void insert(User user) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DbUtils2.getConnection();
            preparedStatement = connection.prepareStatement("insert into user(username, password, email, birthday) values(?, ?, ?, ?)");

            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getBirthday());
            preparedStatement.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public User findUser(String username, String password) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        User user = new User();

        try {
            connection = DbUtils2.getConnection();
            preparedStatement = connection.prepareStatement("select * from user  where username = ? and password = ?");

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                user.setId(Integer.parseInt(resultSet.getObject("id")+""));
                user.setUsername(resultSet.getObject("username")+"");
                user.setUsername(resultSet.getObject("password")+"");
                user.setUsername(resultSet.getObject("email")+"");
                user.setUsername(resultSet.getObject("birthday")+"");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            return user;
        }

    }

    @Override
    public User findUser(String username) {
        return null;
    }
}