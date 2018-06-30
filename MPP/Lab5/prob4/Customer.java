package prob4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fissehaye on 6/29/18.
 */
public class Customer {

    private String name;
    private List<Order> orders;

    Customer(String name) {
        this.name = name;
        orders = new ArrayList<Order>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public String getName() {
        return name;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
