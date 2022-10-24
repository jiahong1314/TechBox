package dao;

import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DoSignDao {

    public void doSign(String stu_num){
        try {
            Connection conn = DBUtil.getConnection();
            String sql ="update student set sign_num=sign_num+1 where stu_num=?";
            PreparedStatement stat = conn.prepareCall(sql);
            stat.setString(1,stu_num);
            stat.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
