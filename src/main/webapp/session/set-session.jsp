<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Set Session</title>
</head>
<body>

<%
    session.setAttribute("user","Ram");
    out.print("session set successfully.");
%>

</body>
</html>
