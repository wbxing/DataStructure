package chapter11.e11_9;

import java.io.*;

public class TestBufferedReaderFile {
    public static void main(String[] args) {
        String path = "test" + File.separator;
        BufferedReader buf = null;
        try {
            buf = new BufferedReader(new FileReader(path + "File.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String str = null;
        while (true) {
            try {
                assert buf != null;
                if ((str = buf.readLine()) == null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println(str);
        }
        try {
            buf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
