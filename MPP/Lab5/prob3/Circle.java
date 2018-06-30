package prob3;


public final class Circle implements Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {

        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}
