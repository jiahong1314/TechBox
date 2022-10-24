package dao;

import entity.ChairMan;
import util.DBUtil;

import java.sql.*;

public class ChairmanUpdateDao {

    public void updateChairman(ChairMan chairMan){
        try {
            Connection conn = DBUtil.getConnection();
            CallableStatement cs = conn.prepareCall("CALL proc_UpdateChairman(?,?,?,?,?,?,?,?,?,?)");
            cs.setString(1,chairMan.getStuNum());
            cs.setString(2,chairMan.getAge());
            cs.setString(3,chairMan.getDate());
            cs.setString(4,chairMan.getPhoneNum());
            cs.setString(5,chairMan.getQq());
            cs.setString(6,chairMan.getEmail());
            cs.setString(7,chairMan.getStuName());
            cs.setString(8,chairMan.getGrade());
            cs.setString(9,chairMan.getCollege());
            cs.setString(10,chairMan.getMajor());
            cs.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
