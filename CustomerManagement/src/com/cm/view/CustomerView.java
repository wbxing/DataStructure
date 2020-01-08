package com.cm.view;

import com.cm.bean.Customer;
import com.cm.service.CustomerList;
import com.cm.util.CMUtility;

public class CustomerView {

    private CustomerList customerLists;


    public CustomerView() {
        this(10);
    }
    public CustomerView(int num) {
        this.customerLists = new CustomerList(num);
        // 默认添加 “张三” 的信息
        Customer customer = new Customer("张三", '男', 30,
                                        "12300000000", "zhangsan@email.com");
        customerLists.addCustomer(customer);
    }

    /**
     * 显示菜单
     */
    public void enterMainMenu() {

        boolean isFlag = true;
        while (isFlag) {
            System.out.println("\n---------------客户信息管理软件---------------\n");
            System.out.println("                  1 添加客户");
            System.out.println("                  2 修改客户");
            System.out.println("                  3 删除客户");
            System.out.println("                  4 客户列表");
            System.out.println("                  5 退    出\n");
            System.out.print("                请选择（1-5）：");

            char menu = CMUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomer();
                    break;
                case '5':
                    System.out.println("确定是否退出（Y/N）：");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
                    break;
            }
        }
    }

    /**
     * 添加客户的操作
     */
    public void addNewCustomer() {
        System.out.println("\n----------------添加客户-----------------\n");
        System.out.print("姓名：");
        String name = CMUtility.readString(13);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString(13);
        System.out.print("邮箱：");
        String email = CMUtility.readString(30);

        Customer customer = new Customer(name, gender, age, phone, email);
        boolean isSuccess = customerLists.addCustomer(customer);
        if (isSuccess) {
            System.out.println("\n---------------添加客户完成---------------\n");
        } else {
            System.out.println("\n------------客户目录已满，添加失败---------\n");
        }

    }

    /**
     * 修改客户的操作
     */
    public void modifyCustomer() {
        // System.out.println("修改客户的操作");
        System.out.println("\n----------------修改客户-----------------\n");
        boolean isFlag = true;
        Customer customer = null;
        int id = 1;
        while (isFlag) {
            System.out.print("请输入待修改客户编号（-1退出）：");
            id = CMUtility.readInt();
            if (id == -1) {
                return;
            }
            customer = getCustomer(id);
            if (customer != null) {
                isFlag = false;
            }
        }
        // 此时已经找到客户
        // 修改信息
        System.out.print("姓名（" + customer.getName() + "）：");
        String name = CMUtility.readString(10, customer.getName());

        System.out.print("性别（" + customer.getGender() + "）：");
        char gender = CMUtility.readChar(customer.getGender());

        System.out.print("年龄（" + customer.getAge() + "）：");
        int age = CMUtility.readInt(customer.getAge());

        System.out.print("电话（" + customer.getPhone() + "）：");
        String phone = CMUtility.readString(13, customer.getPhone());

        System.out.print("邮箱（" + customer.getAge() + "）：");
        String email = CMUtility.readString(30, customer.getEmail());

        Customer newCustomer = new Customer(name, gender, age, phone, email);
        boolean isReplace = customerLists.replaceCustomer(id - 1, newCustomer);
        if (isReplace) {
            System.out.println("\n---------------修改客户完成---------------\n");
        } else {
            System.out.println("\n---------------修改客户失败---------------\n");
        }
    }

    /**
     * 删除客户的操作
     */
    public void deleteCustomer() {
        // System.out.println("删除客户的操作");
        System.out.println("\n----------------删除客户-----------------\n");
        boolean isFlag = true;
        Customer customer = null;
        int id = 1;
        while (isFlag) {
            System.out.print("请输入待删除客户编号（-1退出）：");
            id = CMUtility.readInt();
            if (id == -1) {
                return;
            }
            customer = getCustomer(id);
            if (customer != null) {
                isFlag = false;
            }
        }
        System.out.print("确认是否删除（Y/N）：");
        char isDelete = CMUtility.readConfirmSelection();
        if (isDelete == 'Y') {
            boolean deleteSuccess = customerLists.deleteCustomer(id - 1);
            if (deleteSuccess) {
                System.out.println("\n---------------删除客户完成---------------\n");
            } else {
                System.out.println("\n---------------删除客户失败---------------\n");
            }
        }
    }

    /**
     * 列出所有客户的操作
     */
    public void listAllCustomer() {
        System.out.println("\n----------------客户列表-----------------\n");
        if (customerLists.getTotal() == 0) {
            System.out.println("没有客户记录！");
        } else {
            // System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
            System.out.print("编号");
            System.out.printf("%6s", "姓名");
            System.out.printf("%4s", "性别");
            System.out.printf("%4s", "年龄");
            System.out.printf("%6s", "电话");
            System.out.printf("%15s", "邮箱");
            System.out.println();
            Customer[] customer = customerLists.getCustomers();
            for (int i = 0; i < customer.length; i++) {
                Customer cus = customer[i];
//                System.out.println((i + 1) + "\t\t" + cus.getName() + "\t" + cus.getGender() + "\t\t"
//                                    + cus.getAge() + "\t" + "\t" + cus.getPhone() + "\t" + cus.getEmail());
                System.out.printf("%-8d", (i + 1));
                System.out.printf("%-5s", cus.getName());
                System.out.printf("%-4c", cus.getGender());
                System.out.printf("%-7d", cus.getAge());
                System.out.printf("%-16s", cus.getPhone());
                System.out.printf("%s", cus.getEmail());
                System.out.println();


            }
        }
        System.out.println("\n---------------客户列表完成---------------\n");
    }


    public Customer getCustomer(int id) {
        Customer customer = customerLists.getCustomers(id - 1);
        if (customer == null) {
            System.out.println("无法找到指定客户！");
            return null;
        } else {
            return customer;
        }
    }


}
