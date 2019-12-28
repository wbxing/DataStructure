package chapter11.e11_2;

import java.io.*;

public class TestReader {
    public static void main(String[] args) {
        String path = "test" + File.separator;
        File file = new File(path + "input.txt");
        if (file.exists()) {
            Reader reader = null;
            try {
                reader = new FileReader(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            char [] chars = new char[1024];
            int len = 0;
            try {
                assert reader != null;
                len = reader.read(chars);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(new String(chars, 0, len));
        }
    }
}
