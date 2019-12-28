package chapter_7.problem.p1;

public class Mixed2 {
    public static void main(String[] args) {
        A a = new A();
        A a2 = new C();
        B b = new B();
        C c = new C();
        b.m1();
        c.m2();
        a.m3();
        // B's m1, A's m2, A's m3,
        System.out.println(" ");
        c.m1();
        c.m2();
        c.m3();
        // B's m1, A's m2, C's m3, 13
        System.out.println(" ");
        a.m1();
        b.m2();
        c.m3();
        // A's m1, A's m2, C's m3, 13
        System.out.println(" ");
        a2.m1();
        a2.m2();
        a2.m3();
        // B's m1, A's m2, C's m3, 13
    }
}
