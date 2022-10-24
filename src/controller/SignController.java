package controller;

import dao.getSignInfoDao;
import entity.Sign;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SignController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        HttpSession session = request.getSession();
        //String username = (String)session.getAttribute("username");
        System.out.println(id);
        getSignInfoDao dao = new getSignInfoDao();
        Sign info = dao.info(Integer.parseInt(id));
        session.setAttribute("sign_date",info.getSign_date());
        request.setAttribute("sign",info);
        request.getRequestDispatcher("SignInfo.jsp").forward(request,response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
