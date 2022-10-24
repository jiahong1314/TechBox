package controller;

import dao.SearchStuDao;
import entity.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SearchStuController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String str = request.getParameter("num");
        SearchStuDao dao = new SearchStuDao();
        Student info = dao.getInfo(str);
        if(info.getStu_name()!=null){
            request.setAttribute("student",info);
            request.getRequestDispatcher("StudentInfo.jsp").forward(request,response);
        }else{
            request.getRequestDispatcher("searchNo.jsp").forward(request,response);
        }
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
