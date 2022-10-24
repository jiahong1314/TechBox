package controller;

import dao.StudentScoreDao;
import entity.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class StudentScoreController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String group = (String)session.getAttribute("group");
        StudentScoreDao dao = new StudentScoreDao();
        List<Student> info = dao.getInfo(group);
        for(Student student:info){
            System.out.println(student);
        }
        request.setAttribute("stuList",info);
        request.getRequestDispatcher("UpdateScore.jsp").forward(request,response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
