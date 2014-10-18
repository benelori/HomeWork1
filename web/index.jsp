<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%
    session.setAttribute("loggedIn", false);
    response.sendRedirect("home.jsp");
%>
</body>
</html>
