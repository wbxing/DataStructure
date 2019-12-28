package chapter11.e11_5;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TestEncode {
    public static void main(String[] args) {
        // 乱码问题的出现
        String path = "test" + File.separator;
        File file = new File(path + "output.txt");

        OutputStream out = null;
        try {
            out = new FileOutputStream(file, true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // 强制改变文件的编码
        String str = "\n这是要转码的文字";
        try {
            assert out != null;
            out.write(str.getBytes(StandardCharsets.UTF_8));
            out.write(str.getBytes(StandardCharsets.ISO_8859_1));
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
