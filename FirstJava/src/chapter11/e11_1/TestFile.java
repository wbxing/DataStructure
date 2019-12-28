package chapter11.e11_1;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFile {
    public static void main(String[] args) {
        // 文件的基本操作
        File file = new File("test/test.txt");
        if (!file.exists()) {
            try {
                System.out.println("create: " + file.createNewFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 创建带路径的文件
        file = new File("d:" + File.separator + "demo" + File.separator + "hello" + File.separator + "text.txt");
        if (!file.getParentFile().exists()) {
            System.out.println("mkdirs: " + file.getParentFile().mkdirs());
        }
        if (!file.exists()) {
            try {
                System.out.println("create: " + file.createNewFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 取得文件的目录信息
        file = new File("d:" + File.separator + "Download" + File.separator + "music.mp3");
        if (file.exists()) {
            System.out.println("是否是文件：" + (file.isFile()));
            System.out.println("是否是文件夹：" + (file.isDirectory()));

            double length = (double) file.length() / 1024 / 1024;
            BigDecimal size = new BigDecimal(length).divide(new BigDecimal(1), 2, BigDecimal.ROUND_HALF_UP);
            System.out.println("文件大小：" + size + "M");

            String pattern = "yyyy-MM-dd HH:mm:ss";
            System.out.println("上次修改日期：" + (new SimpleDateFormat(pattern).format(new Date(file.lastModified()))));
        }

        // 列出目录信息
        file = new File("c:" + File.separator);
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            assert files != null;
            for (File f : files) {
                System.out.println(f);
            }
        }

        // 列出目录、子目录以及文件信息
        file = new File("c:" + File.separator + "Users" + File.separator + "Public" + File.separator);
        print(file);
    }

    public static void print(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    print(f);
                }
            }
        }
        System.out.println(file);
    }
}
