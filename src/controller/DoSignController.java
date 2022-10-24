package controller;

import dao.DoSignDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DoSignController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
        String username = (String)session.getAttribute("username");
        String sign_date = (String)session.getAttribute("sign_date");
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateNowStr = sdf.format(d);
        if(dateNowStr.equals(sign_date)){
            DoSignDao dao = new DoSignDao();
            dao.doSign(username);
            response.sendRedirect("getSignInfo.do");
        }else{
            request.getRequestDispatcher("timeout.jsp").forward(request,response);
        }
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doGet(request,response);
    }
}
