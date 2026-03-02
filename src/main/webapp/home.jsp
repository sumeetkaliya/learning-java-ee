<%-- 
    Document   : home
    Created on : 02-Mar-2026, 6:46:31 pm
    Author     : cordadev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! this is jsp page</h1>
        
        <h2> <%= request.getAttribute("msg") %> </h2>
        
    </body>
</html>
