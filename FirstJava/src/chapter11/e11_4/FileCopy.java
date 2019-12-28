package chapter11.e11_4;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        if (args.length != 2) {
            System.out.println("命令执行错误");
            System.exit(1);
        }

        File srcFile = new File(args[0]);
        if (!srcFile.exists()) {
            System.out.println("源文件不存在");
            System.exit(1);
        }

        File drcFile = new File(args[1]);
        if (!drcFile.getParentFile().exists()) {
            boolean flag = drcFile.getParentFile().mkdirs();
            System.out.println(flag);
        }

        // 实现文件复制
        // 定义输入流和输出流
        InputStream in = null;
        try {
            in = new FileInputStream(srcFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        OutputStream out = null;
        try {
            out = new FileOutputStream(drcFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // 保存每次读取的数据长度
        int temp = 0;
        byte [] bytes = new byte[1024];

        // 将每次读进来的数据保存在字节数组里面
        while (true) {
            try {
                assert in != null;
                if ((temp = in.read(bytes)) == -1) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                assert out != null;
                out.write(bytes, 0, temp);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            assert out != null;
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("复制所花费的时间：" + (end - start));
    }
}
