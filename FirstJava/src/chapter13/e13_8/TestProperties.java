package chapter13.e13_8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
    public static void main(String[] args) {
        Properties pro = new Properties();
        // 属性基本操作
        pro.setProperty("BJ", "北京");
        pro.setProperty("TJ", "天津");
        pro.setProperty("SH", "上海");

        System.out.println(pro.getProperty("BJ"));
        System.out.println(pro.getProperty("TJ"));
        System.out.println(pro.getProperty("SH"));
        System.out.println(pro.getProperty("GZ"));                              // 返回 null
        System.out.println(pro.getProperty("GZ", "没有此纪录"));

        // 将属性信息保存进文件
        // 一般而言后缀名可以随意设置，但是为了和国际化对应，一般设置为 *.properties 文件
        try {
            pro.store(new FileOutputStream(new File("test" + File.separator + "area.properties")), "Area Info");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 通过文件流读取属性文件内容
        Properties readProperties = new Properties();
        try {
            readProperties.load(new FileInputStream(new File("test" + File.separator + "area.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("读取的文件内容");
        System.out.println(readProperties.getProperty("BJ"));
    }
}
