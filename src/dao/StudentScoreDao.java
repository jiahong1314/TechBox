package dao;

import entity.Student;
import util.DBUtil;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentScoreDao {
    public List<Student> getInfo(String group){
        List<Student> students = new ArrayList<>();
        try {
            Connection conn = DBUtil.getConnection();
            CallableStatement cs = conn.prepareCall("CALL proc_getStudentScore(?)");
            cs.setString(1,group);
            ResultSet resultSet = cs.executeQuery();
            while (resultSet.next()){
                Student student = new Student();
                student.setStu_num(resultSet.getString("stu_num"));
                student.setStu_name(resultSet.getString("stu_name"));
                student.setStu_score(resultSet.getString("score"));
                students.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }
}
