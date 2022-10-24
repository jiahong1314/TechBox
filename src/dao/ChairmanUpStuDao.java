package dao;

import entity.Student;
import util.DBUtil;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class ChairmanUpStuDao {
    public void updateStu(Student stu){
        try {
            Connection conn = DBUtil.getConnection();
            CallableStatement cs = conn.prepareCall("CALL proc_ChairmanUpStu(?,?,?,?,?)");
            cs.setString(1,stu.getStu_num());
            cs.setString(2,stu.getStu_name());
            cs.setString(3,stu.getStu_major());
            cs.setString(4,stu.getSign_num());
            cs.setString(5,stu.getStu_score());
            cs.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
