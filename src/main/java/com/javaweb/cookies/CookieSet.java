package com.javaweb.cookies;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CookieSet", value = "/cookie-set")
public class CookieSet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.setContentType("text/html");
        PrintWriter pw=response.getWriter();

        Cookie ck=new Cookie("user","Admin");
        ck.setMaxAge(60*60);
        response.addCookie(ck);

        pw.println("Cookie set successfully.");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
