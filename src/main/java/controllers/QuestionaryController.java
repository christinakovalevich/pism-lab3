package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//This annotation declares your java class as servlet with name=QuestionaryController and mappings=/questionary
@WebServlet(name = "QuestionaryController", urlPatterns = "/questionary")
public class QuestionaryController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        There you should return page with questionary

//        String jspFileName = "yourPage.jsp";
//        request.getRequestDispatcher(jspFileName).forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        There you should work with answers from your questionary page

//        String answer1 = request.getParameter("answer1");
//        String answer2 = request.getParameter("answer2");
//        ....
//        You should create QuestionaryService which checks your answers and writing Questionary model in session
//        For example session.setAttribute("questionary", new Questionary(answer1, answer2)
//        You can see it on action in User, UserController, UserService

//        After all actions you need to return a result page which shows user's answers
//        request.getRequestDispatcher(jspFileName).forward(request, response);
    }
}