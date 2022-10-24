package test;

import entity.ChairMan;
import entity.User;
import util.DBUtil;


import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testDB {
    public static void main(String[] args) throws SQLException {
        /*String sql = "select * from users";
        Connection connection = DBUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            String  id = resultSet.getString("stu_num");
            String password = resultSet.getString("password");
            String name = resultSet.getString("stu_name");
            int userType = resultSet.getInt("user_type");
            User user = new User();
            user.setStuNum(id);
            user.setPassword(password);
            user.setUserType(userType);
            System.out.println(id+"---"+password+"----"+name+"----"+userType);
            System.out.println(user);
        }*/
       /* ChairMan chairMan = new ChairMan();
        Connection conn = DBUtil.getConnection();
        CallableStatement cs = conn.prepareCall("CALL proc_getChairmanInfo(?)");
        cs.setString(1,"20181004040");
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
        System.out.println(chairMan);
        resultSet.close();
        *//*preparedStatement.close();
        connection.close();*/
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateNowStr = sdf.format(d);
        System.out.println("格式化后的日期：" + dateNowStr);
    }
}
