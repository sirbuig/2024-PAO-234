package abstractClasses;

import abstractClasses.domain.Circle;
import abstractClasses.domain.Rectangle;
import abstractClasses.domain.Shape;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 12);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());

        Circle circle = new Circle(10);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());

        Shape[] shapes = new Shape[3];
        shapes[0] = rectangle;
        shapes[1] = circle;
//        shapes[2] = new Shape() {
//            @Override
//            public double area() {
//                return 0;
//            }
//
//            @Override
//            public double perimeter() {
//                return 0;
//            }
//        }

        System.out.println(Arrays.toString(shapes));
        circle.sayHello();
        rectangle.sayHello();

        System.out.println(rectangle.toString());
    }
}
