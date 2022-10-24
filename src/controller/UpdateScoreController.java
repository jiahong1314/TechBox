package controller;

import dao.UpdateScoreDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateScoreController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String stu_num = request.getParameter("stu_num");
        String stu_score = request.getParameter("stu_score");
        //System.out.println(stu_num+"  "+stu_score);
        UpdateScoreDAO dao = new UpdateScoreDAO();
        dao.updateScore(stu_num,stu_score);
        request.getRequestDispatcher("Search.jsp").forward(request,response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
