package chapter12.e12_1;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端操作
 */
public class TestClient {
    public static void main(String[] args) {
        // 定义客户端
        Socket client = null;
        // 连接服务器
        try {
            client = new Socket("localhost", 9999);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner scanner = null;
        try {
            assert client != null;
            scanner = new Scanner(client.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert scanner != null;
        scanner.useDelimiter("\n");
        if (scanner.hasNext()) {
            System.out.println("服务器回应数据：" + scanner.next());
        }

        // 关闭相关资源操作
        scanner.close();
        try {
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
