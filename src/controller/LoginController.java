package controller;

import dao.GetGroupDao;
import dao.LoginDao;
import entity.Login;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer selectName = Integer.parseInt(request.getParameter("selectName"));
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        Login login = new Login();
        login.setUsername(userName);
        login.setPassword(password);
        login.setUserType(selectName);
        login.setIpAddress(request.getRemoteAddr());
        LoginDao dao = new LoginDao();
        //System.out.println(login);
        int status = dao.getLogin(login);
        //System.out.println(status);
        if(status==-1){
            request.setAttribute("msg","用户名或密码错误");
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }else if (status==-2){
            request.setAttribute("msg","服务器出现错误");
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }else if(status==0){
            request.setAttribute("msg","请选择正确的身份");
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }else{
            HttpSession session = request.getSession();
            session.setAttribute("username",userName);
            if(selectName==0){ //会长页面
                RequestDispatcher view = request.getRequestDispatcher("ChairmanIndex.jsp");
                view.forward(request,response);
            }else if(selectName==2){//组员页面
                RequestDispatcher view = request.getRequestDispatcher("StudentIndex.jsp");
                view.forward(request,response);
            }else{//组长页面
                GetGroupDao GroupDao = new GetGroupDao();
                String group = GroupDao.getGroup(userName);
                session.setAttribute("group",group);
                RequestDispatcher view = request.getRequestDispatcher("GroupLeaderIndex.jsp");
                view.forward(request,response);
            }
        }

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
