package entity;

public class ChairMan {
    private String stuNum;
    private String stuName;
    private String age;
    private String date;
    private String phoneNum;
    private String qq;
    private String email;
    private String grade;
    private String college;
    private String major;
    private String groupName;
    public ChairMan(){}

    public ChairMan(String stuNum, String stuName, String age,
                    String date, String phoneNum, String qq, String email,
                    String grade, String college, String major, String groupName) {
        this.stuNum = stuNum;
        this.stuName = stuName;
        this.age = age;
        this.date = date;
        this.phoneNum = phoneNum;
        this.qq = qq;
        this.email = email;
        this.grade = grade;
        this.college = college;
        this.major = major;
        this.groupName = groupName;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @Override
    public String toString() {
        return "ChairMan{" +
                "stuNum='" + stuNum + '\'' +
                ", stuName='" + stuName + '\'' +
                ", age='" + age + '\'' +
                ", date='" + date + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", qq='" + qq + '\'' +
                ", email='" + email + '\'' +
                ", grade='" + grade + '\'' +
                ", college='" + college + '\'' +
                ", major='" + major + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
