package chapter8.e8_8;

public class Lambda {
    public static void main(String[] args) {
        // 匿名内部类
        fun1(new FunctionalInterfaceDemo() {
            @Override
            public void print() {
                System.out.println("匿名内部类实例化接口");
            }
        } );

        // Lambda
        fun1(() -> System.out.println("Lambda表达式实例化接口"));
        // 带参数的方法
        //fun2((s1, s2) -> {return s1 + s2;});


        // 传递可变参数，使用静态方法
        fun3((param) -> Interface.sum(param));

    }

    public static void fun1(FunctionalInterfaceDemo functionalInterfaceDemo) {
        functionalInterfaceDemo.print();
    }

//    public static void fun2(Interface inter) {
//        System.out.println(inter.add(10, 20));
//    }

    public static void fun3(Interface inter) {
        System.out.println(inter.add(10, 20, 30));
    }
}
