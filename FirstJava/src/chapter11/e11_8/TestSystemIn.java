package chapter11.e11_8;

import java.io.IOException;
import java.io.InputStream;

public class TestSystemIn {
    public static void main(String[] args) {
        // 实现键盘数据输入
        // 实际不需要此操作
        InputStream in = System.in;
//        byte[] bytes = new byte[1024];
//        System.out.print("请输入数据：");
//        int len = 0;
//        try {
//            len = in.read(bytes);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("输入数据为：" + new String(bytes, 0, len));

        // 不使用 InputStream
//        try {
//            len = System.in.read(bytes);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("输入数据为：" + new String(bytes, 0, len));

        // 改进输入，消除输入长度限制
        // 中文乱码
        StringBuilder sb = new StringBuilder();
        System.out.print("请输入数据：");
        int temp = 0;
        while (true) {
            try {
                if ((temp = in.read()) == -1) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (temp == '\n') break;
            sb.append((char) temp);
        }
        System.out.println("输入的数据为：" + sb);

    }
}
