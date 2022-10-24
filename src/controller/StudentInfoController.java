package controller;

import dao.StudentInfoDao;
import entity.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudentInfoController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String stu_num = (String)request.getSession().getAttribute("username");
        StudentInfoDao dao = new StudentInfoDao();
        Student stu = dao.getInfo(stu_num);
        System.out.println(stu);
        request.setAttribute("student",stu);
        request.getRequestDispatcher("StudentInfo.jsp").forward(request,response);

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
