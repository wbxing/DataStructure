package chapter3.e3_12;

public class Outer {
    private String msg = "Hello World";
    private static  String smsg = "Static Hello World";
    // 内部类
    public class Inner1 {
        private String info = "Hello";
        public void print() {
            System.out.println(Outer.this.msg);
        }
    }
    // 私有内部类，只能在 Outer 中使用
    private class Inner3 {
        public void print() {
            System.out.println(Outer.this.msg);
        }
    }
    public static class Inner4 {
        public void print() {
            System.out.println(Outer.smsg);
        }
    }

    public String getMsg() {
        return msg;
    }

    public void fun() {
        Inner1 in = new Inner1();
        System.out.print("访问内部类的私有属性：");
        System.out.println(in.info);
        System.out.print("Inner1: ");
        new Inner1().print();
        System.out.print("Inner2: ");
        new Inner2(this).print();
    }
    public void fun(final int num) {
        final double score = 99.9;
        class Inner5 {
            public void print() {
                System.out.println("属性：" + Outer.this.msg);
                System.out.println("方法参数：" + num);
                System.out.println("方法变量："  + score);
            }
        }
        System.out.println("方法中的内部类：");
        new Inner5().print();
    }
}
