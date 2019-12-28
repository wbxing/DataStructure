package chapter11.e11_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestBufferedReader {
    public static void main(String[] args) {
        // 键盘输入数据的标准形式
        // System.in 是 InputStream 类的对象
        // BufferedReader 的构造方法需要接收 Reader 类的对象
        // 利用 InputStreamReader 将字节流对象变为字符流对象
        // 字符流方便接收中文，并且支持 String 返回
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入数据：");
        String str = null;
        try {
            str = buf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("输入的内容为：" + str);

        // 结合正则表达式进行输入判断
        boolean flag = true;
        String age = null;
        while (flag) {
            System.out.print("请输入年龄：");
            try {
                age = buf.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            assert age != null;
            if (age.matches("(1)?\\d{1,2}")) {
                System.out.println("年龄是：" + Integer.parseInt(age));
                flag = false;
            } else {
                System.out.println("输入错误，年龄应该由一到三位数字组成！");
                System.out.println("请重新输入");
            }
        }
    }
}
