package com.ottoob.scw.manager.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyAppListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //将路径放到application域中
        ServletContext servletContext = sce.getServletContext();
        System.out.println(servletContext.getContextPath());
        servletContext.setAttribute("REALPATH",servletContext.getContextPath());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
