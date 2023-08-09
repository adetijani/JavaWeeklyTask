package com.example.week6_task.Control;

import com.example.week6_task.Dao.PostDao;
import com.example.week6_task.Models.Posts;
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
import java.util.logging.Logger;

@WebServlet(name = "PostControlServlet", value = "/PostControlServlet")
public class PostControlServlet extends HttpServlet {
    Posts posts;

    private static final Logger logger = Logger.getLogger(PostControlServlet.class.getName());


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        logger.info("I an in  the SERVLET......");

        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher dispatcher = null;
        String content = request.getParameter("content");
        HttpSession session = request.getSession();
        int userId = (int) session.getAttribute("userId");

        posts = new Posts(userId, content);
        try{
            PostDao postDao = new PostDao((DatabaseConnection.getConnection()));
            boolean Con = postDao.makePost(posts);
            if (Con){
                session.setAttribute("Con", "Success");
                request.setAttribute("postId", posts.getPostId());
                System.out.println(Con);
                dispatcher = request.getRequestDispatcher("index.jsp");
            }else{
                request.setAttribute("Con", "failed");
            }

            dispatcher.forward(request, response);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}