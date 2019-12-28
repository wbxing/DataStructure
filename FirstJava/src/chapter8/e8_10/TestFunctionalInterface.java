package chapter8.e8_10;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestFunctionalInterface {
    public static void main(String[] args) {
        // 测试功能型函数接口
        // 接收参数并返回一个结果
        Function<String, Boolean> function = "##book"::startsWith;
        System.out.println(function.apply("##"));

        // 测试消费型函数接口
        // 接收参数，不返回结果
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello World!");

        // 测试供给型函数接口
        // 不接收参数，有返回结果
        Supplier<String> supplier = "String"::toUpperCase;
        System.out.println(supplier.get());

        // 测试断言型函数接口
        // 判断
        Predicate<String> predicate = "hello"::equalsIgnoreCase;
        System.out.println(predicate.test("HELLO"));

    }
}
