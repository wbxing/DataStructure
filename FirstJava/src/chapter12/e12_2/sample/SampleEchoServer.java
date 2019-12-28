package chapter12.e12_2.sample;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Echo 服务端
 * 接收客户端数据并返回
 * 收到 "bye" 时结束
 * 一次只能连接一个客户端
 */
public class SampleEchoServer {
    public static void main(String[] args) {
        ServerSocket server = null;
        try {
            server = new ServerSocket(9999);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("等待客户端连接...");
        Socket client = null;
        try {
            assert server != null;
            client = server.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("客户端正在连接...");

        System.out.println("客户端已经连接");
        // 使用扫描流接收客户端数据
        Scanner scanner = null;
        try {
            assert client != null;
            scanner = new Scanner(client.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert scanner != null;
        scanner.useDelimiter("\n");

        // 使用打印流完成输出
        PrintStream out = null;
        try {
            out = new PrintStream(client.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 设置循环标记
        boolean flag = false;
        while (!flag) {
            if (scanner.hasNext()) {
                String str = scanner.next().trim();
                if ("bye".equalsIgnoreCase(str)) {
                    assert out != null;
                    out.println("Bye Bye");
                    flag = true;
                } else {
                    assert out != null;
                    out.println("ECHO: " + str);
                }
            }
        }

        // 关闭相关资源操作
        // 关闭扫描流
        scanner.close();
        // 关闭打印流
        out.close();
        // 关闭客户端
        System.out.println("客户端正在断开连接...");
        try {
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("客户端已断开连接");
        // 关闭服务器
        System.out.println("服务器正在关闭...");
        try {
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("服务器已经关闭");
    }
}
