package chapter6.problem.test;

import chapter6.problem.MyMath;

public class TestMyMath {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("程序运行出错！");
            System.exit(1);                         // 程序退出
        }
        try {
            MyMath mm = new MyMath();
            System.out.println(mm.div(args[0], args[1])); // 被调用处处理异常
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
