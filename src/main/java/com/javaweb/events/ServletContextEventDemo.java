package com.javaweb.events;

import com.javaweb.database.tables.UserTable;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class ServletContextEventDemo implements ServletContextListener{
    private ServletContext context;
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        context = sce.getServletContext();
        context.setAttribute("cname","aptech");
        System.out.println("context set successfully");

        /**
         * auto create tables
         */
        UserTable.create();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        /**
         * drop auto create table
         */
        UserTable.drop();
    }
}
