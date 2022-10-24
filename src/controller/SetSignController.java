package controller;

import dao.SetSignDao;
import entity.Sign;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SetSignController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String sign_name = request.getParameter("sign_name");
        String sign_date = request.getParameter("sign_date");
        String sign_content = request.getParameter("sign_content");
        String sign_rule = request.getParameter("sign_rule");
        String admin = request.getParameter("admin");
        Sign sign = new Sign(sign_name,sign_date,sign_content,sign_rule,admin);
        //System.out.println(sign);
        SetSignDao dao = new SetSignDao();
        dao.insertSign(sign);
        request.getRequestDispatcher("SetSign.jsp").forward(request,response);

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
