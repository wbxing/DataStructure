package chapter12.e12_2.sample;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class SampleEchoClient {
    public static void main(String[] args) {
        // 定义客户端
        Socket client = null;
        // 连接服务器
        try {
            client = new Socket("localhost", 9999);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner input = new Scanner(System.in);
        Scanner scanner = null;
        try {
            assert client != null;
            scanner = new Scanner(client.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintStream out = null;
        try {
            out = new PrintStream(client.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        input.useDelimiter("\n");
        assert scanner != null;
        scanner.useDelimiter("\n");

        boolean flag = false;
        while (!flag) {
            System.out.print("请输入数据：");
            String str;
            // 判断是否有输入数据
            if (input.hasNext()) {
                str = input.next().trim();
                // 发送到服务端
                assert out != null;
                out.println(str);
                // 判断是否结束
                if ("bye".equalsIgnoreCase(str)) {
                    flag = true;
                }
            }
            // 判断服务器是否回应
            if (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        }

        // 关闭相关资源
        input.close();
        scanner.close();
        out.close();
        try {
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
