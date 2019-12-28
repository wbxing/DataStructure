package chapter3.e3_6;

public class Info {
    private String msg = "Hello";

    public void print() {
        System.out.println("msg: " + msg);
    }

    public void fun(Info temp) {
        temp.msg = "World";
    }
}
