package chapter_1;

public class MyFirstApp {

    public static void main(String[] args) {
        System.out.println("Hello World");
        int x = 3;
        String name = "Dirk";

        x = x * 17;
        System.out.println("x is " + x);
        double d = Math.random();
        System.out.println("My name is " + name);
        System.out.println(d);

        while(x > 12){
            x = x - 1;
            System.out.print(x + " ");
        }
        for (int i = 0; i < 10; i = i + 1){
            System.out.println("i is now " + i);
        }

        if (x == 10) {
            System.out.println("x must be 10.");
        }else {
            System.out.println("x isn't 10. It's " + x);
        }
        if ((x == 3) && (name.equals("Dirk"))){
            System.out.println("Gently");
        }
        System.out.println("This line is runs no matter what!");
    }
}
