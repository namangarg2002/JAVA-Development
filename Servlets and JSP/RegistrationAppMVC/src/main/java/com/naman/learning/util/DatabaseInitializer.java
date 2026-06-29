package com.naman.learning.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitializer {
    public static void initializeDatabase(){
        Connection connect = null;
        Statement stmt = null;

        try {

            connect = DBConnection.getConnection();
            stmt = connect.createStatement();

            String sql = """
                    CREATE TABLE IF NOT EXISTS personalInfo(
                        id INT PRIMARY KEY AUTO_INCREMENT,
                        uname VARCHAR(100) NOT NULL,
                        uemail VARCHAR(100) UNIQUE NOT NULL,
                        upassword VARCHAR(255) NOT NULL,
                        ucity VARCHAR(100) NOT NULL
                    )
                    """;

            stmt.executeUpdate(sql);

            System.out.println("personalInfo table is ready.");
            
        } catch (SQLException  e) {
            e.printStackTrace();
        } finally {
            DBConnection.closeConnection(connect, stmt, null);
        }
    }
}
