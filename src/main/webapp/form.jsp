<%-- 
    Document   : form
    Created on : 02-Mar-2026, 7:10:44 pm
    Author     : cordadev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>User Form</title>
</head>
<body>

<h2>Enter Your Name</h2>

<form action="HelloServlet" method="post">
    Name: <input type="text" name="username"/>
    <input type="submit" value="Submit"/>
</form>

</body>
</html>
