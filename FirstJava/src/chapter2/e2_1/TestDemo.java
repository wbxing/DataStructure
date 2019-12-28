package chapter2.e2_1;

/**
 * 文档注释
 * @author WenbiaoXing
 */

public class TestDemo {
    public static void main(String[] args) {
        // 单行注释

        /*
         * 第一行注释
         * 这也是注释
         */
        // 为变量设置内容使用如下格式：数据类型 变量名称 = 常量;
        int num = 10;                                  // 10是常量，常量的默认数据类型是 int
        int result = num * 2;                          // 利用 num 的数值乘以2，并将其赋值给 result
        System.out.println("result: " + result);       // 输出 result
        // 所有变量名称在同一代码块只允许声明一次
        num = num * 2;                                 // 将 num 乘以2
        System.out.println("num: " + num);

        //溢出
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("max: " + max);
        System.out.println("min: " + min);
        // int 变量 +- int 型常量 = int 型数据
        System.out.println("max + 1 : " + (max + 1));            // 最大值加 1
        System.out.println("min - 1 : " + (min - 1));            // 最小值减 1
        System.out.println("min - 2 : " + (min - 2));            // 最小值减 2

        // 溢出转换
        long number = 2147483650L;
        int x = (int) number;
        System.out.println("x: " + x);

        num = 130;
        byte b = (byte) num;
        System.out.println("b: " + b);

        b = 100;
        System.out.println("b: " + b);

        // 定义变量的时候不设置内容
        int No;
        // 使用变量的时候设置内容
        No = 0;
        System.out.println("No. : " + No);

        // double * int = double
        double n = 10.2;
        System.out.println(n * 2);

        // float 类型
        float f1  = 10.2F;
        float f2 = (float) 10.2;
        // float * float = float
        System.out.println(f1 * f2);

        // int / int = int
        int x1 = 9;
        int y1 = 5;
        System.out.println(x1 / y1);
        // int / double = double
        System.out.println(x1 / (double)y1);

        // 字符型
        char c = 'A';
        int cn = c;
        System.out.print("c: " + c);
        System.out.println(" " + cn);

        //大小写转换
        cn += 32;
        c = (char)cn;
        System.out.println(c);

        // UNICODE
        char unicode = '邢';
        int xing = unicode;
        System.out.println("邢: " + xing);

        // boolean
        boolean flag = false;
        if (!flag) {
            System.out.println("Hello World!");
        }

        // String
        String str = "Hello";
        System.out.println(str);
        // 字符串连接
        str += " World";
        str = str + "!!!";
        System.out.println(str);

        // 字符串和加法运算一起出现
        int numA = 100;
        double numB = 99.0;
        String string = "加法运算：" + numA + numB;
        System.out.println(string);
        string = "加法运算：" + (numA + numB);
        System.out.println(string);

        // 转义字符
        str = "Hello \"World\" \n\tHello WX";
        System.out.println(str);

        //三目运算符
        int NumB = (int) 20;
        max = numA>NumB ? numA : NumB;
        System.out.println(max);

        // 移位运算符
        x = 1;
        System.out.println(x << 3);

    }
}
