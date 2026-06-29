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


@WebServlet("/Register")

public class RegistrationAppMVC extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String name = request.getParameter("uname");
        String email = request.getParameter("uemail");
        String password = request.getParameter("upassword");
        String city = request.getParameter("ucity");

        User user = new User();

        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setCity(city);

        UserDAO dao = new UserDAO();

        boolean status = dao.registerUser(user);

        if(status){
            request.setAttribute("message", "Registration Successful");
            request.setAttribute("user", user);
        }else{
            request.setAttribute("message", "Registration Failed");
        }

        RequestDispatcher rd = request.getRequestDispatcher("success.jsp");

        rd.forward(request, response);
        
    }
    
}
