<%
    String username=request.getParameter("username");
    String password=request.getParameter("password");

    if(username.equals("admin") && password.equals("admin123")){
//        out.print("Welcome Admin");
        response.sendRedirect("welcome.jsp");
    }else{
//        out.print("Invalid username or password");
//        response.sendRedirect("login.jsp");
        String err="Invalid username or password";
        response.sendRedirect("login.jsp?err="+err);
    }
%>