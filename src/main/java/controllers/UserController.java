package controllers;

import models.User;
import services.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "UserController", urlPatterns = "/user")
public class UserController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        UserService userService = new UserService();
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            if (!username.trim().equals("") && !password.trim().equals("")) {
                userService.authorizeUser(new User(username, password), session);
                response.sendRedirect("questionary");

            } else
                throw new RuntimeException("Username or password is null");

        } catch (RuntimeException e) {
            e.printStackTrace();
            session.setAttribute("errorMessage", e.getMessage());
//            Sending error answer with code 400
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
        }
    }
}
