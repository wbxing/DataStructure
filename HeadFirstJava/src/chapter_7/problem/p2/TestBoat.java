package chapter_7.problem.p2;

public class TestBoat {
    public static void main(String[] args) {
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        Rowboat b3 = new Rowboat();
        b2.setLength(32);
        b1.Move();
        b3.Move();
        b2.Move();
    }
}
