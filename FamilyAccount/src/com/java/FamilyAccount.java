package com.java;

import javax.sound.midi.Soundbank;
import java.util.Date;

public class FamilyAccount {

    public static void main(String[] args) {

        boolean isFlag = true;
        // 记录收支明细，这里使用 String 并不好
        String details = "收支\t账户金额\t收支金额\t说明" + "\n";
        // 初始金额
        int money = 10000;
        do {
            // 显示菜单
            System.out.println("---------------家庭收支记账软件---------------");
            System.out.println("                 1. 收支明细");
            System.out.println("                 2. 登记支出");
            System.out.println("                 3. 登记收入");
            System.out.println("                 4. 退    出" + "\n");
            System.out.print("                 请选择（1-4）：");

            // 获取用户选择
            char selection = Utility.readMenuSelection();
            switch (selection) {
                case '1':
                    // System.out.println("收支明细");
                    System.out.println("---------------当前收支明细记录---------------");
                    System.out.println(details);
                    System.out.println("--------------------------------------------" + "\n");

                    break;
                case '2':
                    // System.out.println("登记支出");
                    System.out.print("本次指出金额：");
                    int outcome = Utility.readNumber();

                    System.out.print("本次收入说明：");
                    String outcomeInfo = Utility.readString();

                    // 处理总金额
                    if (money >= outcome) {
                        money -= outcome;
                        // 处理 details
                        details += "支出\t" + money + "\t" + '-' + outcome + "\t" + outcomeInfo + "\n";
                    } else {
                        System.out.println("超出总额度，支付失败");
                    }
                    System.out.println("------------------登记完成------------------" + "\n");
                    break;
                case '3':
                    // System.out.println("登记收入");
                    System.out.print("本次收入金额：");
                    int income = Utility.readNumber();

                    System.out.print("本次收入说明：");
                    String incomeInfo = Utility.readString();

                    // 处理总金额
                    money += income;
                    // 处理 details
                    details += "收入\t" + money + "\t" + '+' + income + "\t" + incomeInfo + "\n";
                    System.out.println("------------------登记完成------------------" + "\n");
                    break;
                case '4':
                    // System.out.println("退出");
                    System.out.print("确认是否退出（Y/N）：");
                    char exitSelection = Utility.readConfirmSelection();
                    // 输入是 ‘Y’ 则退出循环
                    isFlag = exitSelection != 'Y';
                    break;
            }
        } while (isFlag);
    }
}
