package chapter8.test;

import chapter8.e8_4.naive.NaivePoint;

public class TestNaivePoint {
    public static void main(String[] args) {
        NaivePoint naivePoint = new NaivePoint();
        naivePoint.setX(10);
        naivePoint.setY(20);
        int ix = (Integer) naivePoint.getX();
        int iy = (Integer) naivePoint.getY();
        System.out.println("X:" + ix + ", Y:" + iy);

        naivePoint.setX(10.2);
        naivePoint.setY(20.4);
        double dx = (Double) naivePoint.getX();
        double dy = (Double) naivePoint.getY();
        System.out.println("X:" + dx + ", Y:" + dy);

        naivePoint.setX("Hello");
        naivePoint.setY("World");
        String sx = (String) naivePoint.getX();
        String sy = (String) naivePoint.getY();
        System.out.println("X:" + sx + ", Y:" + sy);
    }

}
