package chapter3.e3_9.AdminAndAction;

public class Admin {
    private String aid;
    private String password;
    private Role role;

    public Admin() {}
    public Admin(String aid, String password) {
        this.aid = aid;
        this.password = password;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getAid() {
        return aid;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    public String getInfo() {
        return "管理员编号：" + this.aid + "，密码：" + this.password;
    }
}
