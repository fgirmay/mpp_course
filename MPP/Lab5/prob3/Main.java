package prob3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        Rectangle rectangle = new Rectangle(3, 4);
        Triangle triangle = new Triangle(4, 5);
        Circle circle = new Circle(3);

        shapes.add(rectangle);
        shapes.add(triangle);
        shapes.add(circle);

        double sumOfAreas = 0;

        for (Shape shape : shapes) {

            sumOfAreas += shape.computeArea();
        }

        System.out.println("Sum of Areas " + sumOfAreas);

    }
}
