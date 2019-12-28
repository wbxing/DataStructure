package chapter9.e9_5;

class A {
    synchronized void say(B b) {
        System.out.println("A : give me B, I will give you A.");
        b.get();
    }
    public synchronized void get() {
        System.out.println("A got B");
    }
}

class B {
    synchronized void say(A a) {
        System.out.println("B : give me A, I will give you B.");
        a.get();
    }
    public synchronized void get() {
        System.out.println("B got A");
    }
}

public class Lock implements Runnable {
    private static A a = new A();
    private static B b = new B();
    public static void main(String[] args) throws Exception {
        new Lock();
    }

    private Lock() {
        new Thread(this).start();
        b.say(a);
    }

    @Override
    public void run() {
        a.say(b);
    }
}
