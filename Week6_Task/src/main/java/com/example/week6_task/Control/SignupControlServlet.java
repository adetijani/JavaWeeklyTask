package com.example.week6_task.Control;

import com.example.week6_task.Dao.UserDao;
import com.example.week6_task.Models.User;
import com.example.week6_task.Util.DatabaseConnection;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "SignupControlServlet", value = "/SignupControlServlet")
public class SignupControlServlet extends HttpServlet {
    RequestDispatcher dispatcher = null;
    User user;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        dispatcher = request.getRequestDispatcher("signup.jsp");

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phoneNumber = request.getParameter("phoneNumber");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");

        user = new User(firstName, lastName, phoneNumber, password, email, gender);
        System.out.println(user);

        try {
            UserDao userDao = new UserDao(new DatabaseConnection().getConnection());
            boolean status = userDao.userRegistration(user);

            HttpSession session = request.getSession();
            if (status) {
                session.setAttribute("signup", "success");
                dispatcher = request.getRequestDispatcher("login.jsp");
            } else {
                request.setAttribute("signup", "failed");
                dispatcher = request.getRequestDispatcher("signup.jsp");
            }
            dispatcher.forward(request, response);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

