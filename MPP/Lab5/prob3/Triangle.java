package prob3;

/**
 * Created by fissehaye on 6/30/18.
 */
public final class Triangle implements Shape {

    private final double base;
    private final double height;

    public Triangle(double base, double height) {

        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double computeArea() {

        return 0.5 * base * height;
    }
}
