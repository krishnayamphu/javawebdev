<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
    <style>
        body {
            background-color: aquamarine;
            text-align: center;
            font-family: Arial;
        }

        h1 {
            padding-top: 50px;
        }
    </style>
</head>
<body>
<h1>Welcome to our Homepage</h1>
<p>User: <%= request.getAttribute("user") %></p>
<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Cum deleniti dicta error ex excepturi harum illo ipsa,
    laborum mollitia nobis nulla officiis perferendis repellendus reprehenderit sed tempora veniam vero, vitae.</p>
</body>
</html>
