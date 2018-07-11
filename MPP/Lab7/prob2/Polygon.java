package prob2;

public interface Polygon extends ClosedCurve {

    double[] getSides();

    @Override
    default double computePerimeter() {

        double[] side = getSides();
        double perimeter = 0;
        for (double d : side)
            perimeter += d;

        return perimeter;
    }
}
