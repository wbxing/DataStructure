package chapter12.e12_2.update;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


/**
 * Echo 服务端
 * 接收客户端数据并返回
 * 收到 "bye" 时结束
 * 引入多线程
 */
public class EchoServer {
    public static void main(String[] args) {
        ServerSocket server = null;
        try {
            server = new ServerSocket(9999);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 设置循环标记
        System.out.println("等待客户端连接...");
        boolean flag = false;
        int i = 1;
        while (!flag) {
            Socket client = null;
            try {
                assert server != null;
                client = server.accept();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("客户端" + i + "正在连接...");
            // 创建并启动新线程
            Thread newThread = new Thread(new EchoThread(client, i));
            newThread.start();
            System.out.println("客户端" + (i++) +"已经连接");

        }

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
