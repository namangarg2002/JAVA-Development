package com.naman.learning;
import java.sql.*;
public class LaunchApp2{
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
        String sql= "UPDATE studentinfo set sage=24 where id=2"; 
        int rowAffected = statement.executeUpdate(sql);
        // process the result
        if(rowAffected == 0){
            System.out.println("Updation failed");
        }else{
            System.out.println("Data updated Successfully");
        }

        // close the connection
        statement.close();
        connect.close();
    }
} 