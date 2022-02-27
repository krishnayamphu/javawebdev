<%
    String username=request.getParameter("username");
    String password=request.getParameter("password");

    if(username.trim().equals("admin")&& password.equals("admin123")){
        response.sendRedirect("dashboard.jsp");
    }else{
        out.print("Invalid username or password");
    }
%>