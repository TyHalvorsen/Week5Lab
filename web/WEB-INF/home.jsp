<%-- 
    Document   : home.jsp
    Created on : 26-Jul-2023, 4:44:04 PM
    Author     : octov
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>home page</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <p>Greetings, ${user.username} You are logged in to the Matrix!</p>
        <a href="login?logout=true">Logout</a>
    </body>
</html>
