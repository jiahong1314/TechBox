package dao;

import entity.Sign;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class getSignInfoDao {
    public List<Sign> getSign(){
        List<Sign> list = new ArrayList<>();
        try {
            Connection conn = DBUtil.getConnection();
            String sql = "select * from sign_msg";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                Sign sign = new Sign(rs.getInt("id"),rs.getString("sign_name"),rs.getString("sign_date"),
                        rs.getString("sign_content"),rs.getString("sign_rule"),rs.getString("admin"));
                list.add(sign);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public Sign info(Integer id){
        Sign sign = new Sign();
        try {
            Connection conn = DBUtil.getConnection();
            String sql = "select * from sign_msg where id=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1,id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                 sign = new Sign(rs.getString("sign_name"),rs.getString("sign_date"),
                        rs.getString("sign_content"),rs.getString("sign_rule"),rs.getString("admin"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sign;
    }
}
