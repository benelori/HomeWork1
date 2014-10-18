package controller;

import user.User;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginController extends HttpServlet{

    public LoginController() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        // Gets parameters from the submitted login form.
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // Creates global user instance.
        User user = new User(username, password);
        // Sets default value for loggedIn cookie.
        session.setAttribute("loggedIn", false);
        // TODO add DB logic and validation.
        session.setAttribute("user", user);
        session.setAttribute("loggedIn", true);
        response.sendRedirect("home.jsp");
    }
}
