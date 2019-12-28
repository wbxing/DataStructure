package chapter3.e3_7;

import chapter3.e3_2.NewBook;

public class ThisKey {
    public static void main(String[] args) {
        NewBook bk = new NewBook("Java", 89.9);
        System.out.println(bk.getInfo());

        NewBook booka = new NewBook();
        System.out.println("booka = " + booka);
        booka.print();
        NewBook bookb = new NewBook();
        System.out.println("booka = " + bookb);
        bookb.print();


    }
}
