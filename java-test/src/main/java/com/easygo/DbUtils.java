package com.easygo;

import java.sql.*;

/**
 * Author:   supeng
 * Date:     2019-07-03 11:22
 * Description:  Util
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class DbUtils {
    private static String url = "jdbc:mysql://39.106.208.55:3306/test1?useUnicode=true&characterEncoding=utf8&useSSL=false";
    private static String user = "root";
    private static String password = "Sp_123456";
    private static String driverClass = "com.mysql.jdbc.Driver";

    static {
        try {
            Class.forName(driverClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws Exception{

            return DriverManager.getConnection(url, user, password);

    }

    public static void closeAll(Connection connection, Statement statement, ResultSet resultSet) {
        if (connection != null) {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}