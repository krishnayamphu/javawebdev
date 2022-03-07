package com.javaweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        if(username.equals("user") && password.equals("u123")){
            response.sendRedirect("welcome");
        }else {
            String msg="Invalid username or password";
            request.setAttribute("err",msg);
            request.getRequestDispatcher("login.jsp").include(request, response);
        }
    }
}
