package com.easygo.JDBC;

import com.easygo.bean.User;
import org.junit.jupiter.api.Test;

import java.sql.*;
import java.util.ArrayList;


public class JdbcTest2 {
    // 插入数据
    @Test
    public void insertTest(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DbUtils.getConnection();
            preparedStatement = connection.prepareStatement("insert into user values(?,?,?,?,?)");

            preparedStatement.setString(1, "4");
            preparedStatement.setString(2, "zhaoliu");
            preparedStatement.setString(3, "123456");
            preparedStatement.setString(4, "zhaoliu@126.com");
            preparedStatement.setDate(5, new Date(System.currentTimeMillis()));

            int num = preparedStatement.executeUpdate();

            System.out.println("插入成功行数为："+ num);

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            DbUtils.closeAll(connection, preparedStatement, null);
        }
    }

    //更新数据
    @Test
    public void udpateTest(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DbUtils.getConnection();
            preparedStatement = connection.prepareStatement("update user set name=? where id= ?");

            preparedStatement.setString(1, "wangwu2");
            preparedStatement.setInt(2,3);

            int num =preparedStatement.executeUpdate();

            System.out.println("更新成功："+ num);


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            DbUtils.closeAll(connection, preparedStatement, null);
        }
    }

    //删除数据
    @Test
    public void deleteTest(){
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DbUtils.getConnection();
            preparedStatement = connection.prepareStatement("delete from user where id = ?");

            preparedStatement.setInt(1, 4);

            int num = preparedStatement.executeUpdate();

            System.out.println("删除的行数："+num);


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            DbUtils.closeAll(connection, preparedStatement, null);
        }
    }

    // 查询数据
    @Test
    public void selectTest(){

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DbUtils.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from user");

            ArrayList<User> users = new ArrayList<>();

            while (resultSet.next()){
                User user = new User();
                user.setId(resultSet.getInt(1));
                user.setName(resultSet.getString(2));
                user.setPassword(resultSet.getString(3));
                user.setEmail(resultSet.getString(4));
                user.setBirthday(resultSet.getDate(5));
                users.add(user);
            }

            for (User u: users){
                System.out.println("id:"+u.getId());
                System.out.println("name:"+u.getName());
                System.out.println("password:"+u.getPassword());
                System.out.println("email:"+u.getEmail());
                System.out.println("birthday:"+u.getBirthday());
                System.out.println("========================");
            }





        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            DbUtils.closeAll(connection, statement, resultSet);
        }
    }



}
