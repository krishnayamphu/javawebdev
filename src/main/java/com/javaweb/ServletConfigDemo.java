package com.javaweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletConfigDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.setContentType("text/html");
        PrintWriter pw=response.getWriter();
    String msg="Company Name:Aptech Computer Education Pvt. Ltd., Lalitpur";
        ServletConfig config=getServletConfig();
        String company_name=config.getInitParameter("cname");
        pw.println("Company Name:"+company_name);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
