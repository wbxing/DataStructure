package chapter11.e11_3;

import java.io.*;

public class TestOutputStreamWriter {
    public static void main(String[] args) {
        String path = "test" + File.separator;
        File file = new File(path + "output.txt");
        if (!file.getParentFile().exists()) {
            boolean flag = file.getParentFile().mkdirs();
            System.out.println(flag);
        }

        OutputStream output = null;
        try {
            output = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        // 将 OutputStream 转换为 OutputStreamWriter ，而后向上转型为 Writer
        assert output != null;
        Writer out = new OutputStreamWriter(output);
        String str = "这是要输出的字符串";
        try {
            out.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
