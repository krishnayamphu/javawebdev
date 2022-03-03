<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Get Session</title>
</head>
<body>
<%
    if(session.getAttribute("user")==null){
       out.print("session value is not set yet.");
    }else{
    String user=(String) session.getAttribute("user");
    out.print("User:"+user);
    }

%>
</body>
</html>
