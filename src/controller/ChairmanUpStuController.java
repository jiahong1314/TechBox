package controller;

import dao.ChairmanUpStuDao;
import entity.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ChairmanUpStuController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        Student stu = new Student();
        stu.setStu_num(request.getParameter("stu_num"));
        stu.setStu_name(request.getParameter("stu_name"));
        stu.setStu_major(request.getParameter("stu_major"));
        stu.setSign_num(request.getParameter("sign_num"));
        stu.setStu_score(request.getParameter("stu_score"));
        ChairmanUpStuDao dao = new ChairmanUpStuDao();
        System.out.println(stu);
        dao.updateStu(stu);
        request.getRequestDispatcher("/Search.jsp").forward(request,response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
