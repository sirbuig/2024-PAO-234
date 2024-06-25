package abstractClasses.domain;

public class Rectangle extends Shape {

    private final double length;
    private final double height;

    public Rectangle (double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public double area() {
        return length * height;
    }

    @Override
    public double perimeter() {
        return 2 * (length + height);
    }

    @Override
    public String toString() {
        return ("this is a rectangle");
    }
}
