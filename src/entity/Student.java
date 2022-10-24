package entity;

public class Student {
    private String stu_name;
    private String stu_num;
    private String stu_age;
    private String stu_sex;
    private String stu_major;
    private String stu_college;
    private String stu_group;
    private String stu_grade;
    private String stu_phone;
    private String stu_email;
    private String stu_qq;
    private String sign_num;
    private String stu_score;


    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_num() {
        return stu_num;
    }

    public void setStu_num(String stu_num) {
        this.stu_num = stu_num;
    }

    public String getStu_age() {
        return stu_age;
    }

    public void setStu_age(String stu_age) {
        this.stu_age = stu_age;
    }

    public String getStu_sex() {
        return stu_sex;
    }

    public void setStu_sex(String stu_sex) {
        this.stu_sex = stu_sex;
    }

    public String getStu_major() {
        return stu_major;
    }

    public void setStu_major(String stu_major) {
        this.stu_major = stu_major;
    }

    public String getStu_college() {
        return stu_college;
    }

    public void setStu_college(String stu_college) {
        this.stu_college = stu_college;
    }

    public String getStu_group() {
        return stu_group;
    }

    public void setStu_group(String stu_group) {
        this.stu_group = stu_group;
    }

    public String getStu_grade() {
        return stu_grade;
    }

    public void setStu_grade(String stu_grade) {
        this.stu_grade = stu_grade;
    }

    public String getStu_phone() {
        return stu_phone;
    }

    public void setStu_phone(String stu_phone) {
        this.stu_phone = stu_phone;
    }

    public String getStu_email() {
        return stu_email;
    }

    public void setStu_email(String stu_email) {
        this.stu_email = stu_email;
    }

    public String getStu_qq() {
        return stu_qq;
    }

    public void setStu_qq(String stu_qq) {
        this.stu_qq = stu_qq;
    }


    public String getSign_num() {
        return sign_num;
    }

    public void setSign_num(String sign_num) {
        this.sign_num = sign_num;
    }

    public String getStu_score() {
        return stu_score;
    }

    public void setStu_score(String stu_score) {
        this.stu_score = stu_score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_name='" + stu_name + '\'' +
                ", stu_num='" + stu_num + '\'' +
                ", stu_age='" + stu_age + '\'' +
                ", stu_sex='" + stu_sex + '\'' +
                ", stu_major='" + stu_major + '\'' +
                ", stu_college='" + stu_college + '\'' +
                ", stu_group='" + stu_group + '\'' +
                ", stu_grade='" + stu_grade + '\'' +
                ", stu_phone='" + stu_phone + '\'' +
                ", stu_email='" + stu_email + '\'' +
                ", stu_qq='" + stu_qq + '\'' +
                ", sign_num='" + sign_num + '\'' +
                ", stu_score='" + stu_score + '\'' +
                '}';
    }
}
