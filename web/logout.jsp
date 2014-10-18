<%
    session.removeAttribute("user");
    session.setAttribute("loggedIn", false);
    response.sendRedirect("home.jsp");
%>
