<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<%
    String name=request.getParameter("fullname");
    int age=Integer.parseInt(request.getParameter("age"));
%>
<p>Your fullname is:<%= name %></p>
<p>Your age is: <%= age %></p>
</body>
</html>
