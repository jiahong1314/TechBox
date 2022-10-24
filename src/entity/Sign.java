package entity;

public class Sign {
    private int id;
    private String sign_name;
    private String sign_date;
    private String sign_content;
    private String sign_rule;
    private String admin;

    public Sign(String sign_name, String sign_date, String sign_content, String sign_rule, String admin) {
        this.sign_name = sign_name;
        this.sign_date = sign_date;
        this.sign_content = sign_content;
        this.sign_rule = sign_rule;
        this.admin = admin;
    }

    public Sign(int id, String sign_name, String sign_date, String sign_content, String sign_rule, String admin) {
        this.id = id;
        this.sign_name = sign_name;
        this.sign_date = sign_date;
        this.sign_content = sign_content;
        this.sign_rule = sign_rule;
        this.admin = admin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sign() {
    }

    public String getSign_name() {
        return sign_name;
    }

    public void setSign_name(String sign_name) {
        this.sign_name = sign_name;
    }

    public String getSign_date() {
        return sign_date;
    }

    public void setSign_date(String sign_date) {
        this.sign_date = sign_date;
    }

    public String getSign_content() {
        return sign_content;
    }

    public void setSign_content(String sign_content) {
        this.sign_content = sign_content;
    }

    public String getSign_rule() {
        return sign_rule;
    }

    public void setSign_rule(String sign_rule) {
        this.sign_rule = sign_rule;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Sign{" +
                "id=" + id +
                ", sign_name='" + sign_name + '\'' +
                ", sign_date='" + sign_date + '\'' +
                ", sign_content='" + sign_content + '\'' +
                ", sign_rule='" + sign_rule + '\'' +
                ", admin='" + admin + '\'' +
                '}';
    }
}
