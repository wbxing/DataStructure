package com.team.view;

import com.team.domain.Employee;
import com.team.domain.Programmer;
import com.team.sevrice.NameListService;
import com.team.sevrice.TeamException;
import com.team.sevrice.TeamService;

public class TeamView {

    private NameListService listService = new NameListService();
    private TeamService teamService = new TeamService();

    public void enterMainMenu() {
        boolean loopFlag = true;
        char menu = '0';
        while (loopFlag) {
            if (menu != '1') {
                listAllEmployee();
            }
            System.out.print("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出 请选择（1-4）：");
            menu = TSUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    getTeam();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    System.out.print("确认是否退出（Y/N）：");
                    char selection = TSUtility.readConfirmSelection();
                    if (selection == 'Y') {
                        loopFlag = false;
                    }
                    break;
            }
        }
    }

    private void deleteMember() {
        System.out.println("----------------------------删除团队成员----------------------------");
        System.out.print("请输入要要添加员工的TID：");
        int tid = TSUtility.readInt();
        System.out.println("确认是否删除（Y/N）：");
        char selection = TSUtility.readConfirmSelection();
        if (selection == 'N') {
            return;
        }
        try {
            teamService.removeMember(tid);
            System.out.println("删除成功");
        } catch (TeamException e) {
            System.out.println("添加失败，原因：" + e.getMessage());
        }
        // 按回车键继续...
        TSUtility.readReturn();
        System.out.println("------------------------------------------------------------------");
    }

    private void addMember() {
        System.out.println("----------------------------添加团队成员----------------------------");
        System.out.print("请输入要要添加员工的ID：");
        int id = TSUtility.readInt();
        try {
            Employee employee = listService.getEmployees(id);
            teamService.addMember(employee);
            System.out.println("添加成功");
        } catch (TeamException e) {
            System.out.println("添加失败，原因：" + e.getMessage());
        }
        // 按回车键继续...
        TSUtility.readReturn();
        System.out.println("------------------------------------------------------------------");
    }

    private void getTeam() {
        System.out.println("----------------------------团队成员列表----------------------------");
        System.out.println();
        Programmer[] team = teamService.getTeam();
        if (team == null || team.length == 0) {
            System.out.println("开发团队目前没有成员");
        } else {
            System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
            for (Programmer programmer : team) {
                System.out.println(programmer.getDetailsForTeam());
            }
        }
        System.out.println("------------------------------------------------------------------");
    }

    private void listAllEmployee() {
        System.out.println("--------------------------开发团队调度软件--------------------------");
        System.out.println();
        Employee[] allEmployees = this.listService.getAllEmployees();
        if (allEmployees == null || allEmployees.length == 0) {
            System.out.println("无员工信息");
        } else {
            System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
            for (Employee allEmployee : allEmployees) {
                System.out.println(allEmployee);
            }
        }

        System.out.println("------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        TeamView teamView = new TeamView();
        teamView.enterMainMenu();
    }

}
