<%

    if (session.getAttribute("user") != null) {
        response.sendRedirect("welcome.jsp");
    }
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Login</title>

    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            font-family: Arial;
        }

        .login-form {
            width: 300px;
            background-color: whitesmoke;
            padding: 15px;
            border-radius: 5px;
            box-shadow: 0 0 5px #222222;
        }

        .login-form p {
            color: red;
        }

        form label {
            width: 80px;
            height: 30px;
            display: inline-block;
        }

        input {
            width: 200px;
            height: 30px;
            display: inline-block;
            margin-left: 15px;
        }

        button {
            background-color: #222222;
            color: white;
            text-align: center;
            border: none;
            border-radius: 2px;
            box-shadow: 0 0 2px #333;
            padding: 8px 15px;
        }
    </style>
</head>
<body>
<form class="login-form" action="login" method="post">
    <p>
        <%

            if (request.getAttribute("err") != null) {
                String err = (String) request.getAttribute("err");
                out.print(err);
            }
        %>
    </p>
    <label>Username</label>
    <input type="text" name="username">
    <br><br>

    <label>Password</label>
    <input type="password" name="password">
    <br><br>

    <button type="submit">Login</button>
</form>

</body>
</html>
