package chapter10.e10_1;

public class TestStringBuffer {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello").append("World");
        change(buffer);
        System.out.println(buffer);

        // 取得 CharSequence 接口的实例化对象
        CharSequence sequence = "HelloWorld!";
        System.out.println(sequence);

        // String 转换为 StringBuffer 对象
        // 利用StringBuffer 类的构造方法
        buffer = new StringBuffer("StringBuffer");
        System.out.println(buffer);
        // 利用 append() 方法
        buffer = new StringBuffer();
        buffer.append("StringBuffer");
        System.out.println(buffer);

        // StringBuffer 对象转换为 String
        // toString() 方法
        buffer = new StringBuffer("String");
        String str = buffer.toString();
        System.out.println(str);
        // 利用 String 类的构造方法
        str = new String(buffer);
        System.out.println(str);

        // String 和 StringBuffer 比较
        buffer = new StringBuffer("Hello");
        System.out.println("Hello".contentEquals(buffer));

        // 字符串反转
        buffer = new StringBuffer("Hello");
        System.out.println(buffer.reverse());

        // 在指定索引位置插入数据
        buffer.reverse();
        buffer.insert(0,"www.").insert(9,".com");
        System.out.println(buffer);

        // 删除部分数据
        System.out.println(buffer.delete(5, 8));
    }

    private static void change(StringBuffer buf) {
        buf.append("  ").append("123");
    }
}
