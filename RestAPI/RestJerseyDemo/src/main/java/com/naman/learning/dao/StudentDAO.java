package com.naman.learning.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.naman.learning.model.Student;
import com.naman.learning.util.DBConnection;

public class StudentDAO {
    // INSERT
    public boolean addStudent(Student student){
        boolean status = false;
        Connection connect = null;
        PreparedStatement pstmnt = null;

        try {
            connect = DBConnection.getConnection();
            String sql = "INSERT INTO CollegeStudentsInfo(name, age, city, email, course) VALUES (?, ?, ?, ?, ?)";
            pstmnt = connect.prepareStatement(sql);

            pstmnt.setString(1, student.getName());
            pstmnt.setInt(2, student.getAge());
            pstmnt.setString(3, student.getCity());
            pstmnt.setString(4, student.getEmail());
            pstmnt.setString(5, student.getCourse());

            int rowAffected = pstmnt.executeUpdate();

            if(rowAffected > 0){
                status = true;
            }
        } catch (SQLException  e) {
            e.printStackTrace();
        } finally {
            DBConnection.closeConnection(connect, pstmnt);
        }

        return status;
    }

    // SELECT ALL
    public List<Student> getAllStudents(){
        List<Student> list = new ArrayList<>();


        Connection connect = null;
        PreparedStatement pstmnt = null;
        ResultSet rs = null;

        try {
            connect = DBConnection.getConnection();
            String sql = "SELECT * from CollegeStudentsInfo";

            pstmnt = connect.prepareStatement(sql);
            rs = pstmnt.executeQuery();

            while(rs.next()){

                Student s = new Student();

                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setAge(rs.getInt("age"));
                s.setCity(rs.getString("city"));
                s.setEmail(rs.getString("email"));
                s.setCourse(rs.getString("course"));

                list.add(s);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            DBConnection.closeConnection(connect, pstmnt, rs);
        }

        return list;

    }

    // SELECT BY ID
    public Student getStudentById(int id){
        
        Connection connect = null;
        PreparedStatement pstmnt = null;
        ResultSet rs = null;
        try {

            connect = DBConnection.getConnection();
            String sql = "SELECT * from CollegeStudentsInfo WHERE id=?";

            pstmnt = connect.prepareStatement(sql);
            pstmnt.setInt(1, id);
            rs = pstmnt.executeQuery();

            while (rs.next()) {
                Student s = new Student();

                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setAge(rs.getInt("age"));
                s.setCity(rs.getString("city"));
                s.setEmail(rs.getString("email"));
                s.setCourse(rs.getString("course"));

                return s;
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnection.closeConnection(connect, pstmnt, rs);
        }

        return null;
    }
    // UPDATE
    public boolean updateStudent(Student student){

        boolean status = false;
        Connection connect = null;
        PreparedStatement pstmnt = null;

        try {
            connect = DBConnection.getConnection();

            String sql = "UPDATE CollegeStudentsInfo SET name=?, age=?, city=?, email=?, course=? WHERE id=?";

            pstmnt = connect.prepareStatement(sql);
            pstmnt.setString(1, student.getName());
            pstmnt.setInt(2, student.getAge());
            pstmnt.setString(3, student.getCity());
            pstmnt.setString(4, student.getEmail());
            pstmnt.setString(5, student.getCourse());
            pstmnt.setInt(6, student.getId());

            int rowAffected = pstmnt.executeUpdate();

            if(rowAffected > 0){
                status = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnection.closeConnection(connect, pstmnt);
        }

        return status;
    }

    // DELETE
    public boolean deleteStudent(int id){
        boolean status = false;
        Connection connect = null;
        PreparedStatement pstmnt = null;

        try {
            connect = DBConnection.getConnection();
            String sql = "DELETE FROM CollegeStudentsInfo WHERE id=?";

            pstmnt = connect.prepareStatement(sql);
            pstmnt.setInt(1, id);

            int rowAffected = pstmnt.executeUpdate();

            if(rowAffected > 0){
                status = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBConnection.closeConnection(connect, pstmnt);
        }

        return status;
    }
}
