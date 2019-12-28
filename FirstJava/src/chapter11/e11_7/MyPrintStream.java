package chapter11.e11_7;

import java.io.*;

class PrintUtil {
    // 定义专门的输出操作功能
    private OutputStream output;

    /**
     * 输出目标通过构造方法传递
     * @param output 要输出的对象
     */
    public PrintUtil(OutputStream output) {
        this.output = output;
    }

    // 定义 print 方法
    // 输出 String 对象
    public void print(String x) {
        try {
            this.output.write(x.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // 输出 double 型数据
    public void print(Double x) {
        this.print(String.valueOf(x));
    }
    // 输出 int 型数据
    public void print(int x) {
        this.print(String.valueOf(x));
    }
    // 输出 char 字符
    public void print(char x) {
        this.print(String.valueOf(x));
    }

    // 定义 println 方法
    // 输出 String 对象
    public void println(String x) {
        this.print(x.concat("\n"));
    }
    // 输出 double 型数据
    public void println(double x) {
        this.println(String.valueOf(x));
    }
    // 输出 int 型数据
    public void println(int x) {
        this.println(String.valueOf(x));
    }
    // 输出 char 字符
    public void println(char x) {
        this.println(String.valueOf(x));
    }

    public void close() {
        try {
            this.output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class MyPrintStream {
    public static void main(String[] args) {
        String path = "test" + File.separator;
        PrintUtil pu = null;
        try {
            pu = new PrintUtil(new FileOutputStream(path + "test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert pu != null;
        pu.print("测试字符串");
        pu.println("测试数据");
        pu.print(1 + 1);
        pu.println(1.1 + 1.1);
        pu.close();
    }
}
