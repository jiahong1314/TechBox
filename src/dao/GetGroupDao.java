package dao;

import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetGroupDao  {
    public String getGroup(String stu_num){
        String group = null;
        try {
            Connection conn = DBUtil.getConnection();
            String sql = "select `group` from users where stu_num=?";
            PreparedStatement stat = conn.prepareCall(sql);
            stat.setString(1,stu_num);
            ResultSet resultSet = stat.executeQuery();
            while (resultSet.next()){
                group = resultSet.getString("group");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return group;
    }
}
