package chapter10.e10_9;

import chapter3.e3_1.Book;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

public class TestReflect {
    public static void main(String[] args) throws Exception {
        // 反射的初步操作
        Date date = new Date();
        System.out.println(date.getClass());

        // Class 类对象实例化
        // 调用 Object 类中的 getClass() 方法
        Class<?> cls = date.getClass();
        System.out.println(cls.getName());
        // 使用 类.class 实现
        cls = java.util.Date.class;
        System.out.println(cls.getName());
        // 调用 Class 类的 forName() 方法
        cls = Class.forName("java.util.Date");
        System.out.println(cls.getName());

        // 利用反射实例化对象
        // 未使用关键字 new
        cls = Class.forName("chapter3.e3_1.Book");
        // 反射实例化对象返回的是 Object 类型
        Object obj = cls.newInstance();
        Book book = (Book) obj;
        System.out.println(book);

        // 利用反射调用构造方法
        // 明确调用类中的有参构造
        cls = Class.forName("chapter3.e3_1.Book");
        Constructor<?> con = cls.getConstructor(String.class, double.class);
        obj = con.newInstance("Java", 89.9);
        System.out.println(obj);

        // 反射调用方法
        String filedName = "title";
        cls = Class.forName("chapter3.e3_1.Book");
        obj = cls.newInstance();
        // 取得 setTitle 方法，参数类型为 String
        Method setMethod = cls.getMethod("set" + initCap(filedName), String.class);
        // 取得 getTitle 方法
        Method getMethod = cls.getMethod("get" + initCap(filedName));

        setMethod.invoke(obj, "Java");
        System.out.println(getMethod.invoke(obj));

        // 反射调用成员
        // 利用反射直接操作私有成员
        cls = Class.forName("chapter3.e3_1.Book");
        obj = cls.newInstance();
        Field titleField = cls.getDeclaredField("title");
        // 取消封装
        titleField.setAccessible(true);
        titleField.set(obj, "JSP");
        System.out.println(titleField.get(obj));

    }

    // 首字母大写操作
    private static String initCap(String string) {
        return string.substring(0,1).toUpperCase() + string.substring(1);
    }
}
