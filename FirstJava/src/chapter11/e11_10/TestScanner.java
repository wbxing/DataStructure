package chapter11.e11_10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        // 利用 Scanner 实现键盘输入
        Scanner scanner = new Scanner(System.in);
//        System.out.print("请输入内容：");
//        if (scanner.hasNext()) {
//            System.out.println("输入的内容：" + scanner.next());
//        }
//        scanner.close();

//        System.out.print("请输入成绩：");
//        if (scanner.hasNextDouble()) {
//            double score = scanner.nextDouble();
//            System.out.println("输入的成绩：" + score);
//        } else {
//            System.out.println("输入错误");
//        }
//        scanner.close();

        // 正则验证
//        System.out.print("请输入生日：");
//        String regex = "\\d{4}(-\\d{2}){2}";
//        if (scanner.hasNext(regex)) {
//            String birthday = scanner.next(regex);
//            System.out.println("生日是：" + birthday);
//        } else {
//            System.out.println("生日格式错误");
//        }
//        scanner.close();

        // 读取文件
        String path = "test" + File.separator;
        Scanner scanFile = null;
        try {
            scanFile = new Scanner(new FileInputStream(path + "File.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert scanFile != null;
        scanFile.useDelimiter("\n");
        while (scanFile.hasNext()) {
            System.out.println(scanFile.next());
        }
        scanFile.close();

    }
}
