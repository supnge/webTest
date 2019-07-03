package com.easygo;

import java.sql.*;

public class JdbcTest {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://39.106.208.55:3306/test1?useUnicode=true&characterEncoding=utf8&useSSL=false", "root", "Sp_123456");

            statement = connection.createStatement();
            String sql = "select * from user;";

            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                System.out.print("id: "+resultSet.getObject("id")+" ");
                System.out.print("name: "+resultSet.getObject("name")+" ");
                System.out.print("password: "+resultSet.getObject("password")+" ");
                System.out.print("email: "+resultSet.getObject("email")+" ");
                System.out.println("birthday: "+resultSet.getObject("birthday")+" ");
                System.out.println("===============================");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeAll(connection, statement, resultSet);
        }
    }
}
