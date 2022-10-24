package dao;

import entity.Student;
import entity.User;
import util.DBUtil;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchStuDao {
    public Student getInfo(String str){
        Student student = new Student();
        try {
            Connection conn = DBUtil.getConnection();
            CallableStatement cs = conn.prepareCall("CALL proc_SearchStudentInfo(?)");
            cs.setString(1,str);
            ResultSet rs = cs.executeQuery();
            while (rs.next()){
                student.setStu_num(rs.getString("stu_num"));
                student.setStu_name(rs.getString("stu_name"));
                student.setStu_age(rs.getString("age"));
                student.setStu_sex(rs.getString("sex"));
                student.setStu_major(rs.getString("major"));
                student.setStu_college(rs.getString("college"));
                student.setStu_group(rs.getString("group"));
                student.setStu_grade(rs.getString("grade"));
                student.setStu_phone(rs.getString("phone_num"));
                student.setStu_email(rs.getString("email"));
                student.setStu_qq(rs.getString("qq"));
                student.setStu_score(rs.getString("score"));
                student.setSign_num(rs.getString("sign_num"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }
}
