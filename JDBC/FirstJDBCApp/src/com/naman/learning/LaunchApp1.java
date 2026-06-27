package com.naman.learning;
import java.sql.*;
public class LaunchApp1{
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
        String sql= "INSERT INTO studentinfo(id, sname, sage, scity) VALUES(2, 'Aman', 21, 'Delhi')"; 
        int rowAffected = statement.executeUpdate(sql);
        // process the result
        if(rowAffected == 0){
            System.out.println("Unable to insert the data");
        }else{
            System.out.println("Data inserted Successfully");
        }

        // close the connection
        statement.close();
        connect.close();
    }
} 