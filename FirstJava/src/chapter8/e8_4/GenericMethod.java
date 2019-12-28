package chapter8.e8_4;

public class GenericMethod {
    public static void main(String[] args) {
        String string = fun("Hello World!");
        System.out.println(string);
        System.out.println(string.length());
    }

    /**
     * 泛型方法
     * @param t 引用参数
     * @param <T> 返回类型，同时也是参数类型
     * @return 返回值，直接返回传入内容
     */
    public static <T> T fun(T t) {
        return t;
    }
}
