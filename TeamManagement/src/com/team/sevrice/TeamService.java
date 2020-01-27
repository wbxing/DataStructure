package com.team.sevrice;

import com.team.domain.Architect;
import com.team.domain.Designer;
import com.team.domain.Employee;
import com.team.domain.Programmer;

/**
 * 开发团队成员管理：添加、删除等
 */
public class TeamService {
    // 自增变量，给 memberId 赋值
    private static int counter = 1;
    // 限制开发团队人数
    private final int MAX_MEMBER = 5;
    // 保存开发团队成员
    private Programmer[] team = new Programmer[MAX_MEMBER];
    // 记录开发团队中的实际人数
    private int total;

    public TeamService() {
    }

    /**
     * 获取开发团队中的所有成员
     *
     * @return 当前开发团队的所有成员
     */
    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        System.arraycopy(this.team, 0, team, 0, team.length);
        return team;
    }

    /**
     * 添加成员
     *
     * @param employee 需要添加到开发团队的成员
     */
    public void addMember(Employee employee) throws TeamException {

        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        }

        if (!(employee instanceof Programmer)) {
            throw new TeamException("该员工不是开发成员，无法添加");
        }

        if (isExist(employee)) {
            throw new TeamException("该员工已在开发团队中，无法添加");
        }

        Programmer programmer = (Programmer) employee;
        if ("BUSY".equals(programmer.getStatus().getNAME())) {
            throw new TeamException("该员工已是某开发团队的员工，无法添加");
        } else if ("VOCATION".equals(programmer.getStatus().getNAME())) {
            throw new TeamException("该员工正在休假，无法添加");
        }

        int numOfArchitect = 0;
        int numOfDesigner = 0;
        int numOfProgrammer = 0;
        for (int i = 0; i < total; i++) {
            if (programmer instanceof Architect) {
                numOfArchitect++;
            } else if (programmer instanceof Designer) {
                numOfDesigner++;
            } else {
                numOfProgrammer++;
            }
        }
        if (programmer instanceof Architect) {
            if (numOfArchitect >= 1) {
                throw new TeamException("团队中至多只能有一名架构师");
            }
        } else if (programmer instanceof Designer) {
            if (numOfDesigner >= 2) {
                throw new TeamException("团队中至多只能有两名设计师");
            }
        } else {
            if (numOfProgrammer >= 3) {
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }

        // 将 programmer 添加到现有的 team
        programmer.setStatus(Status.BUSY);
        programmer.setMemberId(counter++);
        team[total++] = programmer;
    }

    /**
     * 判断某员工是否在开发团队中
     *
     * @param employee 需要判断的员工
     * @return 存在返回 true, 不在返回 false
     */
    private boolean isExist(Employee employee) {
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == employee.getId()) {
                return true;
            }
        }
        return false;
    }

    /**
     * 删除成员
     *
     * @param memberId 需要删除的开发团队的成员编号
     */
    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (; i < total ; i++) {
            if (team[i].getMemberId() == memberId) {
                team[i].setStatus(Status.FREE);
                break;
            }
        }

        if (i == total) {
            throw new TeamException("需要删除的成员不存在");
        }

        if (total - 1 - i >= 0) {
            System.arraycopy(team, i + 1, team, i, total - 1 - i);
        }

        team[--total] = null;
    }
}
