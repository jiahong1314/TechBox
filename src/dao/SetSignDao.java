package dao;

import entity.Sign;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SetSignDao {

    public void insertSign(Sign sign){
        try {
            Connection conn = DBUtil.getConnection();
            String sql = "insert into sign_msg (sign_name,sign_date,sign_content,sign_rule,admin) values(?,?,?,?,?)";
            PreparedStatement stat = conn.prepareCall(sql);
            stat.setString(1,sign.getSign_name());
            stat.setString(2,sign.getSign_date());
            stat.setString(3,sign.getSign_content());
            stat.setString(4,sign.getSign_rule());
            stat.setString(5,sign.getAdmin());
            stat.execute();
            stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
