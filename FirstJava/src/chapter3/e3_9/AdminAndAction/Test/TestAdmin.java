package chapter3.e3_9.AdminAndAction.Test;

import chapter3.e3_9.AdminAndAction.Action;
import chapter3.e3_9.AdminAndAction.Admin;
import chapter3.e3_9.AdminAndAction.Group;
import chapter3.e3_9.AdminAndAction.Role;

public class TestAdmin {
    public static void main(String[] args) {
        // 设置数据
        Admin a1 = new Admin("root", "1234");
        Admin a2 = new Admin("guest", "1234");
        Admin a3 = new Admin("admin", "1234");

        Role r1 = new Role(1, "系统管理员");
        Role r2 = new Role(2, "信息管理员");

        Group  g1 = new Group(10, "信息管理");
        Group  g2 = new Group(11, "用户管理");
        Group  g3 = new Group(12, "数据管理");
        Group  g4 = new Group(13, "接口管理");
        Group  g5 = new Group(14, "备份管理");

        Action action01 = new Action(1001, "新闻发布", "-");
        Action action02 = new Action(1002, "新闻列表", "-");
        Action action03 = new Action(1003, "新闻审核", "-");
        Action action04 = new Action(1004, "增加用户", "-");
        Action action05 = new Action(1005, "用户列表", "-");
        Action action06 = new Action(1006, "登录日志", "-");
        Action action07 = new Action(1007, "雇员数据", "-");
        Action action08 = new Action(1008, "部门数据", "-");
        Action action09 = new Action(1009, "公司数据", "-");
        Action action10 = new Action(1010, "服务传输", "-");
        Action action11 = new Action(1011, "短信平台", "-");
        Action action12 = new Action(1012, "全部备份", "-");
        Action action13 = new Action(1013, "局部备份", "-");

        // 设置关系
        a1.setRole(r1);
        a2.setRole(r2);
        a3.setRole(r2);

        r1.setAdmins(new Admin[] {a1});
        r2.setAdmins(new Admin[] {a2, a3});

        r1.setGroups(new Group[] {g1, g2, g3, g4, g5});
        r2.setGroups(new Group[] {g1, g2});

        g1.setRoles(new Role[] {r1, r2});
        g2.setRoles(new Role[] {r1, r2});
        g3.setRoles(new Role[] {r1});
        g4.setRoles(new Role[] {r1});
        g5.setRoles(new Role[] {r1});

        g1.setActions(new Action[] {action01, action02, action03});
        g2.setActions(new Action[] {action04, action05, action06});
        g3.setActions(new Action[] {action05, action08, action09});
        g4.setActions(new Action[] {action10, action11});
        g5.setActions(new Action[] {action12, action13});

        action01.setGroup(g1);
        action02.setGroup(g1);
        action03.setGroup(g1);
        action04.setGroup(g2);
        action05.setGroup(g2);
        action06.setGroup(g2);
        action07.setGroup(g3);
        action08.setGroup(g3);
        action09.setGroup(g3);
        action10.setGroup(g4);
        action11.setGroup(g4);
        action12.setGroup(g5);
        action13.setGroup(g5);

        System.out.println(a1.getInfo());
        System.out.println("\t|- " + a1.getRole().getInfo());
        for (Group g : a1.getRole().getGroups()) {
            System.out.println("\t\t|- " + g.getInfo());
            for (Action a : g.getActions()) {
                System.out.println("\t\t\t|- " + a.getInfo());
            }
        }

        System.out.println(g2.getInfo());
        for (Role r : g2.getRoles()) {
            System.out.println("\t|- " + r.getInfo());
            for (Admin a : r.getAdmins()) {
                System.out.println("\t\t|- " + a.getInfo());
            }
        }
    }
}
