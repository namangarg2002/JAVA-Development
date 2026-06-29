package com.naman.learning.listener;

import com.naman.learning.util.DatabaseInitializer;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class AppInitializer implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        System.out.println("Application Started...");

        DatabaseInitializer.initializeDatabase();

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        System.out.println("Application Stopped...");

    }

}
