<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>My First JSP Page</title>
</head>
<body>

    <h1>Greeting from the Server</h1>

    <%
        // This is a Scriptlet: Java code executed on the server
        String message = "Hello, World!";
        out.print("<p>" + message + "</p>");
    %>

    <p>The current time is: <%= new java.util.Date() %></p>

</body>
</html>