<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (session.getAttribute("user") == null) {
        response.sendRedirect("login.jsp");
    }
%>

<html>
<head>
    <title>Welcome</title>
    <style>
        body{
            background-color: aquamarine;
            text-align: center;
            font-family: Arial;
        }
        h1{
            padding-top: 50px;
        }
    </style>
</head>
<body>
<form action="logout.jsp" method="post">
    <button type="submit">Logout</button>
</form>
<h1>Welcome to Dashboard !</h1>
<p>you are logged in as Admin</p>

</body>
</html>
