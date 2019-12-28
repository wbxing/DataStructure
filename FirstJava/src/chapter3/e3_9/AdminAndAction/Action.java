package chapter3.e3_9.AdminAndAction;

public class Action {
    private int aid;
    private String title;
    private String url;
    private Group group;

    public Action() {}
    public Action(int aid, String title, String url) {
        this.aid = aid;
        this.title = title;
        this.url = url;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public int getAid() {
        return aid;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public Group getGroup() {
        return group;
    }

    public String getInfo() {
        return "权限编号：" + this.aid + "，名称：" + this.title + "，路径：" + this.url;
    }
}
