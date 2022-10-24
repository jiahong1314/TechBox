package dao;

import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateScoreDAO {
    public void updateScore(String num,String score){
        try {
            Connection conn = DBUtil.getConnection();
            String sql = "update student set score=? where stu_num=?";
            PreparedStatement stat = conn.prepareCall(sql);
            stat.setString(1,score);
            stat.setString(2,num);
            stat.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
