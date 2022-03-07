package com.javaweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletWelcome", value = "/ServletWelcome")
public class ServletWelcome extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw=response.getWriter();
        //We can get the ServletContext object from ServletConfig object
        ServletContext application=getServletConfig().getServletContext();
        String user=application.getInitParameter("user");
        request.setAttribute("user",user);
        request.getRequestDispatcher("welcome.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
