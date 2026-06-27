package com.naman.learning;
import java.sql.*;
public class LaunchApp3{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        // Load and register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish the connection
        String url="jdbc:mysql://localhost:3306/jdbclearning";
        String user="root";
        String password="5Lg%7Ot$";
        Connection connect = DriverManager.getConnection(url, user, password);

        // Creating Statement
        Statement statement= connect.createStatement();

        // excecute the query
        String sql = "SELECT * FROM studentinfo"; 
        ResultSet rs = statement.executeQuery(sql);
        // process the result
        while(rs.next()){
            int id = rs.getInt(1);
            String name = rs.getString(2);
            int age = rs.getInt(3);
            String city = rs.getString(4);
            System.out.println(id + " " + name + " " + age + " " + city);
        }

        // close the connection
        rs.close();
        statement.close();
        connect.close();
    }
} 