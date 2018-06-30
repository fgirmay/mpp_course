package problem4;

import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
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
        this.setBaseSalary(baseSalary);
        this.setPercent(percent);
        this.setOrders(orders);
    }

    @Override
    public double calcGrossPay(int month, int year) {

        for (Order order : getOrders()) {
            setCommission(getCommission() + order.getOrderAmount() * getPercent());
        }

        return getCommission() + getBaseSalary();
    }

    public void addOrder(int number, Date date, double amount) {
        orders.add(new Order(number, date, amount));
    }


    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}