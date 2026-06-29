package com.naman.learning.controller;

import java.io.IOException;

import com.naman.learning.dao.UserDAO;
import com.naman.learning.model.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/Login")
public class LoginServlet extends HttpServlet  {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("uemail");
        String password = request.getParameter("upassword");

        UserDAO dao = new UserDAO();
        User user = dao.loginUser(email, password);

        if(user != null){
            HttpSession session = request.getSession();
            session.setAttribute("user", user);

            // Session expires after 30 minutes of inactivity
            session.setMaxInactiveInterval(30 * 60);

            response.sendRedirect("dashboard.jsp");
        }else{
            request.setAttribute("error", "Invalid Email or Password");
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");

            rd.forward(request, response);
        }

    }
}
