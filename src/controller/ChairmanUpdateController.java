package controller;

import dao.ChairmanUpdateDao;
import entity.ChairMan;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ChairmanUpdateController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username =(String) request.getSession().getAttribute("username");
        ChairMan chairMan = new ChairMan();
        chairMan.setStuName(request.getParameter("username"));
        chairMan.setAge(request.getParameter("age"));
        chairMan.setStuNum(request.getParameter("num"));
        chairMan.setGrade(request.getParameter("grade"));
        chairMan.setMajor(request.getParameter("major"));
        chairMan.setCollege(request.getParameter("college"));
        chairMan.setDate(request.getParameter("date"));
        chairMan.setPhoneNum(request.getParameter("phoneNum"));
        chairMan.setQq(request.getParameter("qq"));
        chairMan.setEmail(request.getParameter("email"));
        ChairmanUpdateDao chairmanUpdateDao = new ChairmanUpdateDao();
        chairmanUpdateDao.updateChairman(chairMan);
        //System.out.println(chairMan);
        request.setAttribute("chairman",chairMan);
        request.getRequestDispatcher("chairmanPersonalInfo.jsp").forward(request,response);

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
