<%-- 
    Document   : login
    Created on : 26-Jul-2023, 4:44:29 PM
    Author     : TyHalvorsen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login page</title>
    </head>
    <body>
        <h2>Login</h2>
        <form method="post" action="login">
            username: <input type="text" name="username"><br>
            password: <input type="text" name="password"><br>
            <input type="submit" value="login">
        </form>
        <p>${message}</p>
    </body>
</html>
