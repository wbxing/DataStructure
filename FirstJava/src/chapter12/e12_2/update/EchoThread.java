package chapter12.e12_2.update;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoThread implements Runnable {
    private Socket client;
    private int num;

    public EchoThread(Socket client, int num) {
        this.client = client;
        this.num = num;
    }

    @Override
    public void run() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(this.client.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert scanner != null;
        scanner.useDelimiter("\n");
        PrintStream out = null;
        try {
            out = new PrintStream(this.client.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        System.out.println("客户端" + this.num + "正在断开连接...");
        try {
            this.client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("客户端" + this.num + "已断开连接");
    }
}
