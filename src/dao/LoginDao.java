package dao;

import entity.Login;
import util.DBUtil;

import java.sql.*;

public class LoginDao {
    /*
    * 返回四种状态
    * -2 ：服务器错误   -1：用户名或密码错误 0：用户类型选择错误  1：登录成功
    * */
    public int getLogin(Login login) {
        int status = -2;
        if (login.getUsername() == null || login.getPassword() == null || login.getUsername().equals("")
                || login.getPassword().equals("")){
            return -1;
        }else{
            try {
                Connection conn = DBUtil.getConnection();
                CallableStatement cs = conn.prepareCall("CALL proc_getUserStatus(?,?,?,?,?)");
                cs.setString(1,login.getUsername());
                cs.setString(2,login.getPassword());
                cs.setString(3,login.getIpAddress());
                cs.setInt(4,login.getUserType());
                cs.registerOutParameter(5,Types.SMALLINT);
                cs.execute();
                status = cs.getInt(5);
                return status;
            } catch (Exception e) {
                e.printStackTrace();
                return -2;
            }
        }
    }
}
