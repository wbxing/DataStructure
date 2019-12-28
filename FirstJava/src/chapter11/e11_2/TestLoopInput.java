package chapter11.e11_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class TestLoopInput {
    public static void main(String[] args) throws Exception {
        String path = "test" + File.separator;
        File file = new File(path + "input.txt");

        if (file.exists()) {
            InputStream in = null;
            try {
                in = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            byte [] bytes = new byte[1024];
            int foot = 0;
            int temp = 0;
            assert in != null;
            while ((temp = in.read()) != -1) {
                bytes[foot ++] = (byte) temp;
            }
            in.close();
            System.out.println("[" + new String(bytes, 0, foot) + "]");
        }
    }
}
