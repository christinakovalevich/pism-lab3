package services;

import models.User;

import javax.servlet.http.HttpSession;

//  Simple java class which we will use to help our UserController
public class UserService {

    public void authorizeUser(User user, HttpSession session) {
        if (user != null) {
            session.removeAttribute("user");
            session.setAttribute("user", user);
            System.out.println("User authorized. User details: " + user);
        } else
            throw new RuntimeException("User is null");
    }

}
