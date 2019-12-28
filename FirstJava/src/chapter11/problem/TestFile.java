package chapter11.problem;

import java.io.*;
import java.util.Scanner;

/**
 * 从键盘输入文件的内容和要保存的文件名称
 * 根据输入的名称创建文件，并将内容保存到文件之中
 */
public class TestFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 文件名
        String fileName;
        // 文件内容
        String fileContent;
        // 默认路径
        String path = "src" + File.separator + "chapter11" + File.separator + "problem" + File.separator;
        System.out.print("请输入文件名称：");
        scanner.useDelimiter("\n");
        if (scanner.hasNext()) {
            fileName = scanner.next().trim() + ".txt";
            System.out.println("请输入文件内容：");
            fileContent = scanner.next();

            File file = new File(path + fileName);
            if (!file.getParentFile().exists()) {
                boolean flag = file.getParentFile().mkdirs();
                System.out.println(flag);
            }

            PrintStream ps = null;
            try {
                ps = new PrintStream(new FileOutputStream(file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            assert ps != null;
            ps.print(fileContent);
            ps.close();
        }

    }
}
