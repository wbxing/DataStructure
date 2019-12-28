package chapter3.e3_9.AdminAndAction;

public class Role {
    private int rid;
    private String title;
    private Admin [] admins;
    private Group [] groups;

    public Role() {}
    public Role(int rid, String title) {
        this.rid = rid;
        this.title = title;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAdmins(Admin[] admins) {
        this.admins = admins;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public int getRid() {
        return rid;
    }

    public String getTitle() {
        return title;
    }

    public Admin[] getAdmins() {
        return admins;
    }

    public Group[] getGroups() {
        return groups;
    }

    public String getInfo() {
        return "角色编号：" + this.rid + "，名称：" + this.title;
    }
}
