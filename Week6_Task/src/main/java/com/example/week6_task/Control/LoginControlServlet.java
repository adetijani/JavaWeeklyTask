package com.example.week6_task.Control;

import com.example.week6_task.Models.User;
import com.example.week6_task.Dao.UserDao;
import com.example.week6_task.Util.DatabaseConnection;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

@WebServlet(name = "LoginControlServlet", value = "/LoginControlServlet")
public class LoginControlServlet extends HttpServlet {
    private String message;
    private Connection connection;

    private static final Logger logger = Logger.getLogger(LoginControlServlet.class.getName());


    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("This is your login information: "+request.getParameter("email")+ " "
                +request.getParameter("password"));
        System.out.println(request.getParameter("id"));
        // Hello
        if (request.getParameter("id")!=null) {
            request.setAttribute("id", request.getParameter("id"));
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("Sign_in.jps");
            requestDispatcher.forward(request, response);
        }
        else {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>" + message + "</h1>");
            out.println("</body></html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        logger.info("Email: " + email);
        logger.info("Password: " + password);

        HttpSession session = request.getSession();
        RequestDispatcher dispatcher;

        try {
            UserDao userDao = new UserDao(DatabaseConnection.getConnection());
            User user1 = userDao.userLogin(email, password);

            if (user1 != null){
                session.setAttribute("name", "userId: " + user1.getUserId());
                session.setAttribute("userId", user1.getUserId());
                dispatcher = request.getRequestDispatcher("post.jsp");
            }else {
                request.setAttribute("status", "failed");
                dispatcher = request.getRequestDispatcher("index.jsp");
            }
            dispatcher.forward(request, response);
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public void destroy() {
    }
}