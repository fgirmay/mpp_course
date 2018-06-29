package problem4;

import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fissehaye on 6/28/18.
 */
public class Commissioned extends Employee {

    private double commission;
    private double baseSalary;
    private List<Order> orders = new ArrayList<>();

    private double percent;

    public Commissioned(int empId, double baseSalary, double percent, List<Order> orders) {
        super(empId);
        this.baseSalary = baseSalary;
        this.percent = percent;
        this.orders = orders;
    }

    @Override
    public double calcGrossPay(Month month, Year year) {

        for (Order order : orders) {
            commission += order.getOrderAmount() * percent;
        }

        return commission + baseSalary;
    }


    public double getCommission() {
        return commission;
    }
}