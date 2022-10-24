package dao;

import entity.Student;
import entity.User;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GroupLeaderDao {
    public List<User> getInfo(){
        List<User> users = new ArrayList<>();
        try {
            Connection conn = DBUtil.getConnection();
            String sql = "select stu_num,stu_name,`group` from users where user_type=1";
            PreparedStatement stat = conn.prepareCall(sql);
            ResultSet rs = stat.executeQuery();
            while (rs.next()){
                String num = rs.getString("stu_num");
                String name = rs.getString("stu_name");
                String group = rs.getString("group");
                User user = new User();
                user.setStuNum(num);
                user.setStuName(name);
                user.setGroupName(group);
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
}
