package prob3;

/**
 * Created by fissehaye on 6/30/18.
 */
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
