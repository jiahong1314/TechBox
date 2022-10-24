package dao;

import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class addLeaderDao {
    public void addLeader(String stu_num,String group){
        try {
            Connection conn = DBUtil.getConnection();
            String sql = "update users set user_type=1, `group`=? where stu_num=?";
            PreparedStatement stat = conn.prepareCall(sql);
            stat.setString(1,group);
            stat.setString(2,stu_num);
            stat.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
