package chapter3.e3_3;

/**
 * 构造方法
 */
public class Construction {
    private String parameter1;
    private double parameter2;

    public Construction() {
        System.out.println("无参构造方法");
    }
    public Construction(String p1) {
        System.out.println("带有一个参数的构造方法");
        parameter1 = p1;
    }
    public Construction(String p1, double p2) {
        System.out.println("带有两个参数的构造方法");
        parameter2 = p2;
        parameter1 = p1;
    }

}
