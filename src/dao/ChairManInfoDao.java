package dao;

import entity.ChairMan;
import util.DBUtil;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ChairManInfoDao {

    public ChairMan getInfo(String stu_name){
        ChairMan chairMan = new ChairMan();
        try {
            Connection conn = DBUtil.getConnection();
            CallableStatement cs = conn.prepareCall("CALL proc_getChairmanInfo(?)");
            cs.setString(1,stu_name);
            ResultSet resultSet = cs.executeQuery();
            while (resultSet.next()){
                chairMan.setStuNum(resultSet.getString("stu_num"));
                chairMan.setAge(resultSet.getString("age"));
                chairMan.setDate(resultSet.getString("date"));
                chairMan.setPhoneNum(resultSet.getString("phoneNum"));
                chairMan.setQq(resultSet.getString("qq"));
                chairMan.setEmail(resultSet.getString("email"));
                chairMan.setStuName(resultSet.getString("stu_name"));
                chairMan.setGrade(resultSet.getString("grade"));
                chairMan.setCollege(resultSet.getString("college"));
                chairMan.setMajor(resultSet.getString("major"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return chairMan;
    }
}
