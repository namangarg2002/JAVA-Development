package com.naman.learning;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class RegisterServletApp extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("uname");
        String city = request.getParameter("ucity");

        // Store data in the request scope
        request.setAttribute("name", name);
        request.setAttribute("city", city);

        // Forward to JSP
        RequestDispatcher rd = request.getRequestDispatcher("RegisterSuccess.jsp");
        rd.forward(request, response);

        
    }
}
