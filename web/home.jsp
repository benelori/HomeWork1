<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <% if (session.getAttribute("loggedIn").equals(true)) {%>
    <jsp:useBean id="user" class="user.User" scope="session"/>
    Welcome <%= user.getUsername() %>
    Your Password is <%= user.getPassword() %>
    <a href="logout.jsp">Logout</a>
    <% } else { %>
        <%@include file="login.jsp"%>
    <% } %>
</body>
</html>
