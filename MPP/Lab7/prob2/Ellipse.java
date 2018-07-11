package prob2;

public class Ellipse implements ClosedCurve {
    private double semiMajorAxis;
    private double elllipticValue;

    public Ellipse(double semiMajorAxis, double elllipticValue) {
        super();
        this.semiMajorAxis = semiMajorAxis;
        this.elllipticValue = elllipticValue;
    }


    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis(double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public double getElllipticValue() {
        return elllipticValue;
    }

    public void setElllipticValue(double elllipticValue) {
        this.elllipticValue = elllipticValue;
    }

    @Override
    public double computePerimeter() {

        return 4 * semiMajorAxis * elllipticValue;
    }

}
