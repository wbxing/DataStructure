package chapter4.problem;

/**
 * 矩形类
 */
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return this.length * this.width;
    }

    public double perimeter() {
        return 2 * (this.length + this.width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
