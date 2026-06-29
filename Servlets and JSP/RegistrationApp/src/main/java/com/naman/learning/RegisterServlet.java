package com.naman.learning;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String name = request.getParameter("uname");
        String email = request.getParameter("uemail");
        String password = request.getParameter("upassword");
        String city = request.getParameter("ucity");


        Connection connect = null;
        PreparedStatement pstmnt = null;
        PrintWriter out = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/jdbclearning";
            String user="root";
            String pass="5Lg%7Ot$";

            connect = DriverManager.getConnection(url, user, pass);

            String sql="INSERT INTO personalInfo(uname, uemail, upassword, ucity) VALUES(?, ?, ?, ?)";
            pstmnt = connect.prepareStatement(sql);

            pstmnt.setString(1, name);
            pstmnt.setString(2, email);
            pstmnt.setString(3, password);
            pstmnt.setString(4, city);


            int rowAffected = pstmnt.executeUpdate();

            response.setContentType("text/html");
            out = response.getWriter();

            if(rowAffected > 0){
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Registration Status</title>");
                out.println("</head>");
                out.println("<body style='font-family:Arial; text-align:center; margin-top:100px;'>");

                out.println("<h1 style='color:green;'>Registration Successful ✔</h1>");
                out.println("<h2>Welcome " + name + "</h2>");
                out.println("<p>Your account has been created successfully.</p>");

                out.println("<a href='index.html'>Go Back</a>");

                out.println("</body>");
                out.println("</html>");
            }else{
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Registration Status</title>");
                out.println("</head>");
                out.println("<body style='font-family:Arial; text-align:center; margin-top:100px;'>");

                out.println("<h1 style='color:red;'>Registration Failed ✖</h1>");
                out.println("<p>Something went wrong while creating your account.</p>");

                out.println("<a href='index.html'>Try Again</a>");

                out.println("</body>");
                out.println("</html>");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();

            response.setContentType("text/html");
            out = response.getWriter();

            out.println("<h1>Database Error!</h1>");
            out.println("<p>" + e.getMessage() + "</p>");
        }finally{
            if (out != null) {
                out.close();
            }
            try {
                if (pstmnt != null) {
                    pstmnt.close();
                }

                if (connect != null) {
                    connect.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
        }
    }
    
}
