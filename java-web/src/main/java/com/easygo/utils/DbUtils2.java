package com.easygo.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Author:   supeng
 * Date:     2019-07-03 11:22
 * Description:  Util
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class DbUtils2 {


    /*
    private static String url ;
    private static String user ;
    private static String password ;
    private static String driverClass ;

    static {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("db");
        url = resourceBundle.getString("url");
        user = resourceBundle.getString("user");
        password = resourceBundle.getString("password");
        driverClass = resourceBundle.getString("driverClass");
        System.out.println(driverClass);
        try {
            Class.forName(driverClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws Exception{

            return DriverManager.getConnection(url, user, password);

    }
    */

    // 使用dbcp实现数据库连接
    /*
    private static DataSource dataSource;

    static {
        Properties properties = new Properties();

        try {
            properties.load(DbUtils2.class.getClassLoader().getResourceAsStream("dbcpconfig.properties"));

            try {
                dataSource = BasicDataSourceFactory.createDataSource(properties);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }*/

    //使用c3p0实现数据库连接
    private static DataSource dataSource = new ComboPooledDataSource();

    public static DataSource getDataSource(){
        return  dataSource;
    }

    public static Connection getConnection() throws Exception{
            return dataSource.getConnection();
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