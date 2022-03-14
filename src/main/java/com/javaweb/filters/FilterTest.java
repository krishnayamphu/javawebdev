package com.javaweb.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter({"/welcome","/servlet-test"})

//@WebFilter({"/*"})
public class FilterTest implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("before filter invoked");
        chain.doFilter(request,response);
        out.println("after filter invoked");
    }

    @Override
    public void destroy() {

    }
}
