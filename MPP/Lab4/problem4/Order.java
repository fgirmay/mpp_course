package problem4;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by fissehaye on 6/28/18.
 */
public class Order {

    private int orderNo;
    private double orderAmount;
    private Commissioned commissioned;
    private Date localDate;

    public Order(int orderNo, Date localDate, double orderAmount) {

        this.setOrderNo(orderNo);
        this.localDate = localDate;
        this.setOrderAmount(orderAmount);
    }

    public void addCommission(Commissioned commissioned) {
        this.commissioned = commissioned;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }
}
