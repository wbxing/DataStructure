package chapter_10;

public class TestBox {
    // 书中源代码
//    Integer i;
//    int j;
    // 更改后
    int i;
    Integer j;

    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
    }

    public void go() {
        j = i;
        System.out.println(j);
        System.out.println(i);
    }

}
