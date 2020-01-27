package com.team.sevrice;

import com.team.domain.*;

/**
 * 负责将 Data 中的数据封装到 Employee[] 数组中，同时提供相关操作 Employee[] 的方法
 */
public class NameListService {

    private Employee[] employees;

    public NameListService() {
        employees = new Employee[Data.EMPLOYEES.length];
        for (int i = 0; i < Data.EMPLOYEES.length; i++) {
            String[] e = Data.EMPLOYEES[i];
            // 获取员工类型
            int type = Integer.parseInt(e[0]);
            // 获取4个基本信息
            int id = Integer.parseInt(e[1]);
            String name = e[2];
            int age = Integer.parseInt(e[3]);
            double salary = Double.parseDouble(e[4]);
            Equipment equipment;
            double bonus;
            int stock;
            switch (type){
                case Data.EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case Data.PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                case Data.DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;
                case Data.ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    stock = Integer.parseInt(Data.EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                    break;
            }
        }
    }

    private Equipment createEquipment(int index) {
        int key = Integer.parseInt(Data.EQUIPMENTS[index][0]);

        switch (key) {
            case Data.PC:
                return new PC(Data.EQUIPMENTS[index][1], Data.EQUIPMENTS[index][2]);
            case Data.NOTEBOOK:
                return new Notebook(Data.EQUIPMENTS[index][1], Double.parseDouble(Data.EQUIPMENTS[index][2]));
            case Data.PRINTER:
                return new Printer(Data.EQUIPMENTS[index][1], Data.EQUIPMENTS[index][2]);
        }
        return null;
    }

    public Employee[] getAllEmployees() {
        return employees;
    }
    public Employee getEmployees(int id) throws TeamException {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        throw new TeamException("找不到指定的员工");
    }
}
