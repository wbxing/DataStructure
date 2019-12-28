package chapter11.e11_8;

import java.io.IOException;
import java.io.OutputStream;
import java.util.function.Consumer;

public class TestSystemOut {
    public static void main(String[] args) {
        // System.out 默认提供实例化对象
        OutputStream out = System.out;

        try {
            out.write("Hello World".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 消费性函数接口与方法引用
        Consumer<String> con = System.out::println;
        con.accept("Hello World!");
    }
}
