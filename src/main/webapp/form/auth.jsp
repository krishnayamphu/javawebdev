<%
    String username=request.getParameter("username");
    String password=request.getParameter("password");

    if(username.equals("admin") && password.equals("admin123")){
        session.setAttribute("user",username);
        response.sendRedirect("welcome.jsp");
    }else{
        String err="Invalid username or password";
        session.setAttribute("err",err);
        response.sendRedirect("login.jsp");
    }
%>