package chapter4.test;

import chapter4.e4_10.MyInt;

public class TestMyInt {
    public static void main(String[] args) {
        MyInt myInt = new MyInt(10);
        int temp = myInt.intValue();
        System.out.println(temp * 2);

        /*
         * 装箱与拆箱操作
         */
        // int 装箱
        Integer obj1 = new Integer(10);
        int temp1 = obj1.intValue();
        System.out.println(temp1 * 2);
        // double 装箱
        Double obj2 = new Double(10);
        double temp2 = obj2.doubleValue();
        System.out.println(temp2 * 2);
        // boolean 装箱
        Boolean obj3 = new Boolean(true);
        boolean temp3 = obj3.booleanValue();
        System.out.println(temp3);

        // 自动装箱与拆箱
        Integer obj4 = 10;
        int temp4 = obj4;
        obj4++;
        System.out.println(temp4 * obj4);

        // Integer 的实例化操作
        Integer obja = 10;
        Integer objb = 10;
        Integer objc = new Integer(10);
        System.out.println(obja == objb);
        System.out.println(obja == objc);
        System.out.println(objc == objb);
        System.out.println(obja.equals(objc));

        // Object 接收所有数据类型
        Object object = 10;     // 先自动装箱，再向上转型
        int integer = (Integer) object; // 先向下转型，再自动拆箱
        System.out.println(integer * 10);

        // double 的自动装箱与拆箱
        Double d = 10.2;
        System.out.println(d * 2);  // 直接用于计算

        // boolean 的自动装箱与拆箱
        Boolean flag = true;
        if (flag) {
            System.out.println("flag is true");
        }

        /*
         * 数据类型装换
         */
        // String 转换为基本数据类型
        String str = "123";
        int i = Integer.parseInt(str);
        System.out.println(i * 8);

        str = "1.3";
        double num = Double.parseDouble(str);
        System.out.println(num * 2);

        str = "true";
        flag = Boolean.parseBoolean(str);
        if (flag) {
            System.out.println("flag is true");
        } else {
            System.out.println("flag is false");
        }

        // 基本数据类型转换为 String 类型
        int number = 100;
        str = number + "";
        System.out.println(str);

        str = String.valueOf(number);
        System.out.println(str);
    }
}
