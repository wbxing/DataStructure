package chapter12.e12_1;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器端操作
 * 只允许连接一次
 */
public class TestServer {
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

        // 使用打印流完成输出
        PrintStream ps = null;
        try {
            assert client != null;
            ps = new PrintStream(client.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert ps != null;
        ps.println("Hello World");
        // 关闭相关资源操作
        // 关闭打印流
        ps.close();
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
