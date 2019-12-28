package chapter10.e10_2;

import java.io.IOException;

public class TestRuntime {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 观察内存大小
        Runtime run = Runtime.getRuntime();
        System.out.println("1 MAX = " + run.maxMemory());
        System.out.println("1 TOTAL = " + run.totalMemory());
        System.out.println("1 FREE = " + run.freeMemory());

        String str = "";
        // 产生大量垃圾
        for (int i = 0; i < 2000; i++) {
            str += i;
        }

        System.out.println("2 MAX = " + run.maxMemory());
        System.out.println("2 TOTAL = " + run.totalMemory());
        System.out.println("2 FREE = " + run.freeMemory());

        // 垃圾处理
        run.gc();

        System.out.println("3 MAX = " + run.maxMemory());
        System.out.println("3 TOTAL = " + run.totalMemory());
        System.out.println("3 FREE = " + run.freeMemory());

        // 调用本机可执行程序
        Process process = run.exec("notepad.exe");
        Thread.sleep(2000);
        process.destroy();
    }
}
