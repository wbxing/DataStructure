package chapter11.e11_2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

// 文件内容的输出
public class TestFileOutput {
    public static void main(String[] args) throws Exception {
        // 1 定义文件的路径
        String path = "test" + File.separator;
        File file = new File(path + "test.txt");

        // 判断文件目录是否存在
        if (!file.getParentFile().exists()) {
            // 创建目录
            boolean flag = file.getParentFile().mkdirs();
            System.out.println(flag);
        }

        // 2 使用 OutputStream 和其子类进行对象实例化
        //OutputStream out = new FileOutputStream(file);
        // 文件追加形式
        OutputStream out = new FileOutputStream(file, true);
        // 字节输出流使用字节输出，需要将 String 转换为字节数组
        String str = "这是字节数组的输出内容： Hello World!";
        byte [] bytes = str.getBytes();
        // out.write(bytes);
        // 采用单个字节输出
//        for (byte aByte : bytes) {
//            out.write(aByte);
//        }
        // 输出部分字节内容
        out.write(bytes, 6, 6);
        out.close();
    }
}
