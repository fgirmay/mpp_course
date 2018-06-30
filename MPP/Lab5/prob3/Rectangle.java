package prob3;

public final class Rectangle implements Shape {

    private final double height;
    private final double width;

    public Rectangle(double height, double width) {

        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double computeArea() {

        return width * height;
    }
}
