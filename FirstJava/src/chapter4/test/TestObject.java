package chapter4.test;

import chapter4.e4_7.InterfaceObject;
import chapter4.e4_7.ObjectDemo;

public class TestObject {
    public static void main(String[] args) {
        // 向下转型
        Object object1 = new ObjectDemo();
        Object object2 = "hello";
        ObjectDemo objectDemo = (ObjectDemo) object1;
        String string = (String) object2;

        // 取得对象信息 toString()
        System.out.println(object1);
        // System.out.println(object1.toString());
        System.out.println(object2);

        // 覆写 toString() 和 equals() 方法
        object1 = new ObjectDemo("string", 123);
        System.out.println(object1);
        object2 = new ObjectDemo("string", 123);
        System.out.println(object1.equals(object2));

        // Object 与引用数据类型
        object1 = new int[] {1, 2, 3};
        System.out.println(object1);
        if (object1 instanceof int[]) {
            int [] data = (int[]) object1;
            for (int x : data) {
                System.out.println(x);
            }
        }

        // Object 类接收接口对象
        InterfaceObject interfaceObject = new ObjectDemo();
        Object obj = interfaceObject;
        InterfaceObject t = (InterfaceObject) obj;
        t.fun();
        System.out.println(t);
    }
}
