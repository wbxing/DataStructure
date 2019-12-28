package chapter11.e11_6;

import java.io.*;

public class TestFileMerge {
    public static void main(String[] args) {
        String path = "test" + File.separator;
        File fileA = new File(path + "FileA.txt");
        File fileB = new File(path + "FileB.txt");

        // 字节输入流
        InputStream inA = null;
        try {
            inA = new FileInputStream(fileA);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        InputStream inB = null;
        try {
            inB = new FileInputStream(fileB);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // 内存输出流
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        int temp = 0;
        while (true) {
            try {
                assert inA != null;
                if ((temp = inA.read()) == -1) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            out.write(temp);
        }

        while (true) {
            try {
                assert inB != null;
                if ((temp = inB.read()) == -1) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            out.write(temp);
        }
        byte[] bytes = out.toByteArray();
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            inA.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            inB.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(new String(bytes));

    }
}
