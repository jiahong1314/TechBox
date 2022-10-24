package controller;

import dao.getSignInfoDao;
import entity.Sign;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class getSignInfoController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getSignInfoDao dao = new getSignInfoDao();
        List<Sign> sign = dao.getSign();
        request.setAttribute("signList",sign);
        request.getRequestDispatcher("Signs.jsp").forward(request,response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
