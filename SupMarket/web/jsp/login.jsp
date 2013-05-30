<%-- 
    Document   : login
    Created on : 8 mars 2013, 14:24:48
    Author     : schatteleyn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <title>Login</title>
    </head>
    <body>
        <form method="POST">
            <div>
                <label for="email">Email:</label>
                <input type="text" name="email" />
            </div>
            <div>
                <label for="password">Password:</label>
                <input type="password" name="password" />
            </div>
            <div>
                <input type="submit" value="Submit" />
            </div>
        </form>
    </body>
</html>
