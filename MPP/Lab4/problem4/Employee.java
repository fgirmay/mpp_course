package problem4;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

/**
 * Created by fissehaye on 6/28/18.
 */
public abstract class Employee {

    LocalDate date = LocalDate.of(2018, 11, 29);
    Month month;
    Year year;

    Paycheck paycheck;

    public int empId;

    public Employee(int empId) {
        this.empId = empId;
    }

    public void print() {
        calcCompensation(1, 1);
        paycheck.print();

        //Commissioned commissioned = new Commissioned();
    }

    public Paycheck calcCompensation(int month, int year) {

        double gross = calcGrossPay(month, year);
        paycheck = new Paycheck(gross);
        //payCheck.print();
        return paycheck;
    }

    public abstract double calcGrossPay(int month, int year);

}
