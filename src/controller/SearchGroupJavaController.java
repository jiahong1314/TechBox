package controller;

import dao.SearchGroupDao;
import entity.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class SearchGroupJavaController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String groupName = request.getParameter("groupName");
        //System.out.println(groupName);
        SearchGroupDao dao = new SearchGroupDao();
        List<Student> list = dao.SearchInfo(groupName);
        /*for(Student stu:list){
            System.out.println(stu);
        }*/
        request.setAttribute("stuList",list);
        request.setAttribute("msg",list.size());
        request.getRequestDispatcher("teamMember.jsp").forward(request,response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
