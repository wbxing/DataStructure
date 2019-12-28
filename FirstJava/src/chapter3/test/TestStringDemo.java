package chapter3.test;

import chapter3.e3_6.StringDemo;

public class TestStringDemo {
    public static void main(String[] args) {
        String str = "www.google.com";
        System.out.println(str);

        str = new String("www.facebook.com");
        System.out.println(str);

        // 字符串的比较 1
        // 判断 int 数据是否相等
        int x = 10;
        int y = 10;
        System.out.println(x == y);

        //判断 String 数据是否相等
        String stra = "hello";
        //String strb = new String("hello");
        String strb = "hello";
        String strc = stra;
        // 使用 == 比较
        System.out.println(stra == strb);
        System.out.println(stra == strc);
        System.out.println(strc == strb);
        // 实现字符串内容比较
        System.out.println(stra.equals(strb));
        System.out.println(stra.equals(strb));
        System.out.println(strb.equals(strc));

        //字符串就是匿名对象
        str = "hello";
        System.out.println("hello".equals(str));

        // 字符与字符串
        str = "hello";
        char c = str.charAt(0);        // 取出第一个字符
        System.out.println(c);

        // 字符数组与字符串的转换
        // 字符串拆分成字符数组
        char [] chars = str.toCharArray();
        for (char ch : chars) {
            System.out.print(ch + "\t");
        }
        System.out.println();

        // 转换大写
        for (int i = 0; i < chars.length; ++i) {
            chars[i] -= ('a' - 'A');
        }
        System.out.println(new String(chars));
        System.out.println(new String(chars, 1, 2));

        // 判断字符串是否全部有数字构成
        // str = "123456789";
        str = "123a56789";
        StringDemo stringDemo = new StringDemo();
        if (stringDemo.isNumber(str)) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }

        // 字符串与字节
        // 字符串与字节数组的转换
        str = "helloworld";
        byte [] bytes = str.getBytes();
        for (byte bt : bytes) {
            System.out.print(bt + "\t");
        }
        System.out.println();

        for (int i = 0; i < bytes.length; ++i) {
            bytes[i] -= ('a' - 'A');
        }
        System.out.println(new String(bytes));
        System.out.println(new String(bytes, 5, 5));

        // 字符串比较 2
        stra = "Hello";
        strb = "hELLO";
        System.out.println(stra.equals(strb));
        System.out.println(stra.equalsIgnoreCase(strb));

        strc = "HEllo";
        System.out.println(stra.compareTo(strc));
        if (stra.compareTo(strc) > 0) {
            System.out.println(">");
        } else {
            System.out.println("<");
        }

        // 字符串查找
        System.out.println(str.indexOf("world"));
        System.out.println(str.indexOf("l"));
        System.out.println(str.indexOf("l", 5));
        System.out.println(str.lastIndexOf("l"));

        if (str.indexOf("world") != -1) {
            System.out.println("OK!");
        }

        // contains() 方法
        if (str.contains("world")) {
            System.out.println("OK!");
        }

        // 开头或者结尾判断
        str = "##@@hello**";
        System.out.println(str.startsWith("##"));
        System.out.println(str.startsWith("@@", 2));
        System.out.println(str.endsWith("**"));

        // 字符串替换
        str = "helloWorld";
        System.out.println(str.replaceAll("l", "_"));
        System.out.println(str.replaceFirst("l", "_"));

        // 字符串截取
        // 从指定索引截取到结尾
        String strA = str.substring(5);
        System.out.println(strA);
        // 截取部分子串
        String strB = str.substring(0, 5);
        System.out.println(strB);

        // 字符串拆分
        // 全部拆分
        str = "hello world! hello Java.";
        String [] result = str.split(" ");
        for (String res : result) {
            System.out.println(res);
        }
        // 部分拆分
        result = str.split(" ", 3);
        for (String res : result) {
            System.out.println(res);
        }
        // 按空串拆分
        result = str.split("");
        for (String res : result) {
            System.out.print(res + "\t");
        }
        System.out.println();

        // 避免正则表达式的影响
        str = "192.168.1.2";
        result = str.split("\\.");
        for (String res : result) {
            System.out.print(res + "\t");
        }
        System.out.println();
        // 复杂拆分
        str = "zhang:20|li:21|wang:22";
        result = str.split("\\|");  // 第一次拆分
        for (String res : result) {
            String [] temp = res.split(":");
            System.out.println("Name: " + temp[0] + "\tAge: " + temp[1]);
        }

        // 其他方法
        // 连接
        str = "hello".concat("World!");
        System.out.println(str);
        //大小写转换
        str = "((**HelloWorld**))";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        // 去除开头结尾空格
        str = "     Hello    World     ";
        System.out.println("[" + str + "]");
        System.out.println("[" + str.trim() + "]");
        // 去除全部空格
        System.out.println(str.replaceAll(" ", ""));
        // 取得字符串长度
        System.out.println(str.length());
        // 判断字符串是否为空
        System.out.println(str.isEmpty());
        System.out.println("".isEmpty());
        //首字母大写
        str = "helloWorld";
        System.out.println(stringDemo.initCap(str));

        // String 引用传递
        String msg = "hello";
        fun(msg);
        System.out.println(msg);

        // int 引用传递
        int num = 10;
        fun(num);
        System.out.println(num);
    }

    public static void fun(String temp) {
        temp = "World";
    }
    public static void fun(int temp) {
        temp = 100;
    }

}
