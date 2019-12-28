package chapter11.e11_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TestPrintStream {
    public static void main(String[] args) {
        String path = "test" + File.separator;
        PrintStream ps = null;
        try {
            ps = new PrintStream(new FileOutputStream(path + "test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert ps != null;
        ps.print("测试字符串");
        ps.println("测试数据");
        ps.print(1 + 1);
        ps.println(1.1 + 1.1);
        ps.close();
    }
}
