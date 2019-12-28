package chapter8.test;

import chapter8.e8_4.Point;

public class TestPoint {
    public static void main(String[] args) {
        Point<String> p = new Point<>();
        p.setX("Hello");
        p.setY("World");
        String x = p.getX();
        String y = p.getY();
        System.out.println(x + ' ' + y);

        Point<Integer> point = new Point<>();
        point.setX(10);
        point.setY(20);
        int pointX = point.getX();
        int pointY = point.getY();
        System.out.println(pointX +  " " + pointY);
    }
}
