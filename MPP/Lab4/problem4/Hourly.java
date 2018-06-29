package problem4;

import java.time.Month;
import java.time.Year;

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
    public double calcGrossPay(Month month, Year year) {

        // To be implemented
        return 4 * hoursPerWeek * hourlyPay;
    }
}
