package chapter4.problem.Test;

import chapter4.problem.Rectangle;
import chapter4.problem.Round;
import chapter4.problem.Shape;
import chapter4.problem.Triangle;

public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(1, 2);
        Shape shape2 = new Triangle(1, 2, 2);
        Shape shape3 = new Round(1);

        System.out.println(shape1.area());
        System.out.println(shape1.perimeter());

        System.out.println(shape2.area());
        System.out.println(shape2.perimeter());

        System.out.println(shape3.area());
        System.out.println(shape3.perimeter());
    }
}
