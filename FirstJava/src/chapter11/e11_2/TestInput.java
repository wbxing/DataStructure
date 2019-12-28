package chapter11.e11_2;

import java.io.*;

public class TestInput {
    public static void main(String[] args) {
        String path = "test" + File.separator;
        File file = new File(path + "input.txt");
        if (file.exists()) {
            // 使用 InoutStream 进行读取
            InputStream in = null;
            try {
                in = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            byte [] bytes = new byte[1024];
            int len = 0;
            try {
                if (in != null) {
                    len = in.read(bytes);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                assert in != null;
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("[" + new String(bytes, 0, len) + "]");
        }
    }
}
