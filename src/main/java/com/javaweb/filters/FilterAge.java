package com.javaweb.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter({"/voter"})
public class FilterAge implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        int age=Integer.parseInt(req.getParameter("age"));
        if(age>=18){
            chain.doFilter(req,res);
        }else {
            res.setContentType("text/html");
            PrintWriter out=res.getWriter();
            out.print("Invalid age value!");
            RequestDispatcher rd=req.getRequestDispatcher("voter-form.jsp");
            rd.include(req, res);
        }

    }

    @Override
    public void destroy() {

    }
}
