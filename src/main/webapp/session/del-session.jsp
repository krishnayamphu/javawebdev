<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Del Session</title>
</head>
<body>

<%
    session.invalidate();
    out.print("all session destroyed successfully.");
%>

</body>
</html>
