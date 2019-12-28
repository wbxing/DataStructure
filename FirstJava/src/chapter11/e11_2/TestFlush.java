package chapter11.e11_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TestFlush {
    public static void main(String[] args) {
        String path = "test" + File.separator;
        File file = new File(path + "output.txt");
        if (!file.getParentFile().exists()) {
            boolean flag =  file.getParentFile().mkdirs();
            System.out.println(flag);
        }
        Writer out = null;
        try {
            out = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String str = "这是要输出的字符串";
        try {
            assert out != null;
            out.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 强制刷新缓冲区
        try {
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
