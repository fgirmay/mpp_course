package problem4;

import java.time.LocalDate;

/**
 * Created by fissehaye on 6/28/18.
 */
public class Order {

    private int orderNo;
    private double orderAmount;
    private Commissioned commissioned;

    private LocalDate localDate;

    public Order(int orderNo, LocalDate localDate, double orderAmount) {

        this.setOrderNo(orderNo);
        this.localDate = localDate;
        this.setOrderAmount(orderAmount);
        //this.commissioned = commissioned;
        //this.commissioned.addOders(this);
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
