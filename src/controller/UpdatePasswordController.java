package controller;

import dao.UpdatePasswordDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdatePasswordController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username =(String ) request.getSession().getAttribute("username");
        String password = request.getParameter("password");
        String password1 = request.getParameter("password1");
        System.out.println(username+"--"+password+"--"+password1);
        if(!password.equals(password1)){
            request.setAttribute("updatemsg","两次密码输入不一致");
            request.getRequestDispatcher("password.jsp").forward(request,response);
        }else{
            UpdatePasswordDao dao = new UpdatePasswordDao();
            System.out.println(username+"--"+password);
            dao.updatePassword(username,password);
            request.getRequestDispatcher("password.jsp").forward(request,response);
        }
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
