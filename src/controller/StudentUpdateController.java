package controller;

import dao.StudentUpdateDao;
import entity.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudentUpdateController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
       String stu_num = (String) request.getSession().getAttribute("username");
       Student s = new Student();
       s.setStu_num(request.getParameter("stu_num"));
       s.setStu_name(request.getParameter("stu_name"));
       s.setStu_age(request.getParameter("stu_age"));
       s.setStu_sex(request.getParameter("stu_sex"));
       s.setStu_major(request.getParameter("stu_major"));
       s.setStu_college(request.getParameter("stu_college"));
       s.setStu_group(request.getParameter("stu_group"));
       s.setStu_grade(request.getParameter("stu_grade"));
       s.setStu_phone(request.getParameter("stu_phone"));
       s.setStu_email(request.getParameter("stu_email"));
       s.setStu_qq(request.getParameter("stu_qq"));
       s.setStu_score("0");
       s.setSign_num("0");
       StudentUpdateDao dao = new StudentUpdateDao();
       dao.update(s);
        System.out.println(s);
       request.setAttribute("student",s);
       request.getRequestDispatcher("StudentInfo.jsp").forward(request,response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
