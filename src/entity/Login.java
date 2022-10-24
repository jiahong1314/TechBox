package entity;

public class Login {
    private String username;
    private String password;
    private String ipAddress;
    private Integer userType;
    public Login() {
    }

    public Login(String username, String password,Integer userType) {
        super();
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public String toString() {
        return "Login{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", userType=" + userType +
                '}';
    }
}
