package dao;

import entity.Student;
import util.DBUtil;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SearchGroupDao {
    public List<Student> SearchInfo(String group){
        List<Student> stu = new ArrayList<>();
        try {
            Connection conn = DBUtil.getConnection();
            CallableStatement cs = conn.prepareCall("CALL proc_SearchGroupInfo(?)");
            cs.setString(1,group);
            ResultSet resultSet = cs.executeQuery();
            while (resultSet.next()){
                Student student = new Student();
                student.setStu_name(resultSet.getString("stu_name"));
                student.setStu_num(resultSet.getString("stu_num"));
                student.setStu_major(resultSet.getString("major"));
               /* student.setStu_college(resultSet.getString("college"));
                student.setStu_grade(resultSet.getString("grade"));*/
                student.setStu_score(resultSet.getString("score"));
                student.setSign_num(resultSet.getString("sign_num"));
                stu.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stu;
    }
}
