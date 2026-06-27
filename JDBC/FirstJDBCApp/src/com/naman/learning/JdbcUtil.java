package com.naman.learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcUtil {
    
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException{
        // Establish the connection
        String url="jdbc:mysql://localhost:3306/jdbclearning";
        String user="root";
        String password="5Lg%7Ot$";
        return DriverManager.getConnection(url,user,password);
    }

    public static void closeConnection(Connection connect, Statement statement){
        try {
            statement.close();
            connect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
