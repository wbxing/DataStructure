package chapter_4;

public class Dog {
    public int size;
    //String name;

    public void bark() {
        if (size > 60){
            System.out.println("Woof! Woof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
    public void bark (int numOfBarks) {
        while (numOfBarks > 0) {
            System.out.println("ruff");
            numOfBarks = numOfBarks - 1;
        }
    }
}
