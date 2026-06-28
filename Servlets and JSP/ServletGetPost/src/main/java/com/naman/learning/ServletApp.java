package com.naman.learning;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/ServletApp")
public class ServletApp extends HttpServlet {
    

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Control in servlet/controller");

        String name = request.getParameter("uname");
        String city = request.getParameter("ucity");

        if(name.equals("Rohan") && city.equals("Pune")){
            System.out.println("Success! He is the right Rohan to loggedIn");
        }else{
            System.out.println("Different Rohan LoggedIn");
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Control in servlet/controller");

        String name = request.getParameter("uname");
        String city = request.getParameter("ucity");

        if(name.equals("Rohan") && city.equals("Pune")){
            System.out.println("Success! He is the right Rohan to loggedIn");
        }else{
            System.out.println("Different Rohan LoggedIn");
        }
    }
}
