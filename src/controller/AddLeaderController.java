package controller;

import dao.addLeaderDao;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddLeaderController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        String stu_num = request.getParameter("stu_num");
        String group = request.getParameter("group");
        addLeaderDao dao = new addLeaderDao();
        dao.addLeader(stu_num,group);
        response.sendRedirect("GroupLeader.do");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request,response);
    }
}
