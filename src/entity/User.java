package entity;

public class User {
    private int id;
    private String stuNum;
    private String password;
    private String stuName;
    private String grade;
    private String college;
    private String major;
    private String groupName;
    private int userType;

    public User() {
    }

    public User(int id, String stuNum, String password, String stuName, String grade, String college, String major, String groupName, int userType) {
        this.id = id;
        this.stuNum = stuNum;
        this.password = password;
        this.stuName = stuName;
        this.grade = grade;
        this.college = college;
        this.major = major;
        this.groupName = groupName;
        this.userType = userType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", stuNum='" + stuNum + '\'' +
                ", password='" + password + '\'' +
                ", stuName='" + stuName + '\'' +
                ", grade='" + grade + '\'' +
                ", college='" + college + '\'' +
                ", major='" + major + '\'' +
                ", groupName='" + groupName + '\'' +
                ", userType=" + userType +
                '}';
    }
}
