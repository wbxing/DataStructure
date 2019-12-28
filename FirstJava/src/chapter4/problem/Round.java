package chapter4.problem;

/**
 * 圆形类
 */
public class Round extends Shape {
    private double radius;

    public Round() {
    }

    public Round(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double perimeter() {
        return Math.PI * radius * 2;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
