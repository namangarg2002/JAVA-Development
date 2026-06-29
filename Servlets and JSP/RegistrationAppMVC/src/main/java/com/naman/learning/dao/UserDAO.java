package com.naman.learning.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.naman.learning.model.User;
import com.naman.learning.util.DBConnection;

public class UserDAO {
    public boolean registerUser(User user){
        boolean status = false;

        Connection connect = null;
        PreparedStatement pstmnt = null;

        try {

            connect = DBConnection.getConnection();

            String sql = "INSERT INTO personalInfo(uname, uemail, upassword, ucity) VALUES (?, ?, ?, ?)";

            pstmnt = connect.prepareStatement(sql);
            pstmnt.setString(1, user.getName());
            pstmnt.setString(2, user.getEmail());
            pstmnt.setString(3, user.getPassword());
            pstmnt.setString(4, user.getCity());

            int rowAffected = pstmnt.executeUpdate();

            if(rowAffected > 0){
                status = true;
            }
            
        } catch (SQLException  e) {
            e.printStackTrace();
        } finally {
            DBConnection.closeConnection(connect, pstmnt, null);
        }

        return status;
    }

    public User loginUser(String email, String password){
        Connection connect = null;
        PreparedStatement pstmnt = null;
        ResultSet rs = null;

        try {
            connect = DBConnection.getConnection();
            String sql = "SELECT * FROM personalInfo WHERE uemail = ? AND upassword = ?";

            pstmnt = connect.prepareStatement(sql);
            pstmnt.setString(1, email);
            pstmnt.setString(2, password);

            rs = pstmnt.executeQuery();

            if(rs.next()){
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("uname"));
                user.setEmail(rs.getString("uemail"));
                user.setPassword(rs.getString("upassword"));
                user.setCity(rs.getString("ucity"));

                return user;
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnection.closeConnection(connect, pstmnt, rs);
        }

        return null;
    }
}
