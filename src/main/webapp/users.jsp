<%-- 
    Document   : users
    Created on : 02-Mar-2026, 7:38:34 pm
    Author     : cordadev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <title>Users</title>
</head>
<body>

<h2>Users from Database</h2>

<ul>
<%
    List<String> list = (List<String>) request.getAttribute("userList");
    for(String name : list){
%>
    <li><%= name %></li>
<%
    }
%>
</ul>

</body>
</html>