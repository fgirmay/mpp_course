package problem4;

import java.time.Month;
import java.time.Year;

/**
 * Created by fissehaye on 6/28/18.
 */
public class Salaried extends Employee {

    private double salary;

    public Salaried(int empId, double salary) {
        super(empId);
        this.salary = salary;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        return salary;
    }
}
