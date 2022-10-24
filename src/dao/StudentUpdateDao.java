package dao;

import entity.Student;
import util.DBUtil;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class StudentUpdateDao {
    public void update(Student s){
        Connection conn = null;
        try {
            conn = DBUtil.getConnection();
            CallableStatement cs = conn.prepareCall("CALL proc_UpdateStudentInfo(?,?,?,?,?,?,?,?,?,?,?)");
            cs.setString(1,s.getStu_num());
            cs.setString(2,s.getStu_age());
            cs.setString(3,s.getStu_phone());
            cs.setString(4,s.getStu_qq());
            cs.setString(5,s.getStu_email());
            cs.setString(6,s.getStu_name());
            cs.setString(7,s.getStu_grade());
            cs.setString(8,s.getStu_college());
            cs.setString(9,s.getStu_major());
            cs.setString(10,s.getStu_sex());
            cs.setString(11,s.getStu_group());
            cs.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
