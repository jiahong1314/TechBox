package dao;

import util.DBUtil;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class UpdatePasswordDao {
    public void updatePassword(String stu_num,String password){

        try {
            Connection connection = DBUtil.getConnection();
            CallableStatement cs = connection.prepareCall("CALL proc_UpdatePassword(?,?)");
            cs.setString(1,stu_num);
            cs.setString(2,password);
            cs.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
