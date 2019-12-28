package chapter3.e3_9.AdminAndAction;

public class Group {
    private int gid;
    private String title;
    private Role [] roles;
    private Action [] actions;

    public Group() {}
    public Group(int gid, String title) {
        this.gid = gid;
        this.title = title;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRoles(Role[] roles) {
        this.roles = roles;
    }

    public void setActions(Action[] actions) {
        this.actions = actions;
    }

    public int getGid() {
        return gid;
    }

    public String getTitle() {
        return title;
    }

    public Role[] getRoles() {
        return roles;
    }

    public Action[] getActions() {
        return actions;
    }

    public String getInfo() {
        return "权限组编号：" + this.gid + "，名称：" + this.title;
    }
}
