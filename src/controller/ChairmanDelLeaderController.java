package controller;

import dao.DelLeaderDao;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ChairmanDelLeaderController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String stu_num = request.getParameter("stu_num");
        DelLeaderDao dao = new DelLeaderDao();
        dao.delLeader(stu_num);
        response.sendRedirect("GroupLeader.do");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request,response);
    }
}
