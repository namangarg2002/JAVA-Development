package com.naman.learning.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/jdbclearning";

    private static final String USER = "root";

    private static final String PASSWORD = "5Lg%7Ot$";

    public static Connection getConnection(){
        Connection connect = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return connect;
    }

    public static void closeConnection(Connection connect, Statement statement, ResultSet rs){
        try {
            if (rs != null) {
                rs.close();
            }
            if(statement != null){
                statement.close();
            }
            if(connect != null){
                connect.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
