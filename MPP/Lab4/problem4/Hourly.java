package problem4;

/**
 * Created by fissehaye on 6/28/18.
 */
public class Hourly extends Employee {

    private double hourlyPay;
    private double hoursPerWeek;

    public Hourly(int empId, double hourlyPay, double hoursPerWeek) {

        super(empId);
        this.hourlyPay = hourlyPay;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calcGrossPay(int month, int year) {

        // To be implemented
        return 4 * hoursPerWeek * hourlyPay;
    }
}
