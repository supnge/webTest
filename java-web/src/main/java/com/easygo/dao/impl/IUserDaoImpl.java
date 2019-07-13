package com.easygo.dao.impl;

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
    public boolean insert(User user) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        boolean result = false ;

        try {
            connection = DbUtils2.getConnection();
            preparedStatement = connection.prepareStatement("insert into user(username, password, email, birthday) values(?, ?, ?, ?)");

            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getBirthday());
            result = preparedStatement.execute();
            return result;

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            return result;
        }

    }

    @Override
    public User findUser(String username, String password) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        User user = new User();
        ResultSet resultSet = null;

        try {
            connection = DbUtils2.getConnection();
            preparedStatement = connection.prepareStatement("select * from user  where username = ? and password = ?");

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                user.setId(Integer.parseInt(resultSet.getObject("id")+""));
                user.setUsername(resultSet.getObject("username")+"");
                user.setPassword(resultSet.getObject("password")+"");
                user.setEmail(resultSet.getObject("email")+"");
                user.setBirthday(resultSet.getObject("birthday")+"");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            DbUtils2.closeAll(connection, preparedStatement,resultSet);
            return user;
        }

    }

    @Override
    public User findUser(String username) {
        // TODO Auto-generated method stub
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User user = null;
        try {
            conn = DbUtils2.getConnection();
            String sql = "SELECT * FROM user WHERE username = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while(rs.next()){
                user = new User();
                user.setId(rs.getInt(1));
                user.setUsername(rs.getString(2));
                user.setPassword(rs.getString(3));
                user.setEmail(rs.getString(4));
                user.setBirthday(rs.getObject("birthday")+"");
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            DbUtils2.closeAll(conn, ps,rs);
        }
        return user;
    }
}