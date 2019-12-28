package chapter11.e11_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

// 打印流 JDk1.5 之后的改进
public class TestUpdatePrintStream {
    public static void main(String[] args) {
        String name = "zhang";
        int age = 19;
        double score = 59.95891023456;
        String path = "test" + File.separator;
        PrintStream ps = null;
        try {
            ps = new PrintStream(new FileOutputStream(path + "test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert ps != null;
        ps.printf("Name: %s，Age: %d，Score: %5.2f", name, age, score);
        ps.close();

        // 格式化字符串
        String str = String.format("Name: %s，Age: %d，Score: %5.2f", name, age, score);
        System.out.println(str);
    }
}
