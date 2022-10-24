package controller;

import dao.ChairManInfoDao;
import entity.ChairMan;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ChairManInfoController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username =(String) request.getSession().getAttribute("username");
        ChairManInfoDao dao = new ChairManInfoDao();
        ChairMan chairMan = dao.getInfo(username);
        request.setAttribute("chairman",chairMan);
        request.getRequestDispatcher("chairmanPersonalInfo.jsp").forward(request,response);

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
