package controller;

import dao.GroupLeaderDao;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GroupLeaderController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GroupLeaderDao dao = new GroupLeaderDao();
        List<User> info = dao.getInfo();
       /* for(User user:info){
            System.out.println(user);
        }*/
        request.setAttribute("stuList",info);
        request.getRequestDispatcher("teamLeader.jsp").forward(request,response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
