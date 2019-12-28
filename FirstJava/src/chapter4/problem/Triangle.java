package chapter4.problem;

/**
 * 三角形类
 */
public class Triangle extends Shape {
    private double edgeA;
    private double edgeB;
    private double edgeC;

    public Triangle() {
    }

    public Triangle(double edgeA, double edgeB, double edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
    }

    public double area() {
        double p = (edgeA + edgeB + edgeC) / 2.;
        return Math.sqrt(p * (p - edgeA) * (p - edgeB) * (p - edgeC));
    }

    public double perimeter() {
        return this.edgeA + this.edgeB + this.edgeC;
    }
}
