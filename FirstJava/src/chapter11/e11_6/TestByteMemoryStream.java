package chapter11.e11_6;

import java.io.*;

public class TestByteMemoryStream {
    public static void main(String[] args){
        // 内存字节流，小写转大写
        String str = "hello world!";

        // 先将数据保存进内存，然后从里面取出每一个数据
        // 将所有要保存的数据设置到内存输入流
        InputStream in = new ByteArrayInputStream(str.getBytes());
        // 取出数据
        OutputStream out = new ByteArrayOutputStream();

        // 取出每一个字节数据
        int temp = 0;
        // 循环保存
        while (true) {
            try {
                if (((temp = in.read()) == -1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                out.write(Character.toUpperCase(temp));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(out);
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
