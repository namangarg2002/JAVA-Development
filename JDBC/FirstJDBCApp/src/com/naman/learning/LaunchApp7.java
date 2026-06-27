package com.naman.learning;
import java.sql.*;
import java.util.Scanner;

public class LaunchApp7 {
    public static void main(String[] args) {
        Connection connect = null;
        // Statement statement = null;
        PreparedStatement pstmnt = null;
        Scanner sc = new Scanner(System.in);

        try {

            connect = JdbcUtil.getConnection();
            String sql = "INSERT INTO studentinfo(id, sname, sage, scity) VALUES(?, ?, ?, ?)";
            Student stu = StudentInfo.getStudentDetails(sc);
            pstmnt = connect.prepareStatement(sql);
            pstmnt.setInt(1, stu.getId());
            pstmnt.setString(2, stu.getName());
            pstmnt.setInt(3, stu.getAge());
            pstmnt.setString(4, stu.getCity());

            int rowAffected = pstmnt.executeUpdate();
            if(rowAffected == 0){
                System.out.println("Insertion failed");
            }else{
                System.out.println("Data Inserted Successfully");
            }

            
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            sc.close();
            JdbcUtil.closeConnection(connect, pstmnt);
        }
    }
}
