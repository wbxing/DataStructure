package chapter3.e3_12;

public class Inner2 {
    private Outer out;
    public Inner2() {}
    public Inner2(Outer out) {
        this.out = out;
    }
    public void print() {
        // 标准写法，外部类.this = 外部类当前对象
        System.out.println(this.out.getMsg());
    }
}
