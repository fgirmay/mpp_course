package prob4.test;

import prob4.CustOrderFactory;
import prob4.Customer;
import prob4.Order;

import java.time.LocalDate;

/**
 * Created by fissehaye on 6/29/18.
 */
public class Main {
    public static void main(String[] args) {

        Customer cust = CustOrderFactory.createCustomer("Bob");
        Order order1 = CustOrderFactory.createOrder(cust, LocalDate.now());
        CustOrderFactory.createItem(order1, "Shirt");
        CustOrderFactory.createItem(order1, "Laptop");

        Order order2 = CustOrderFactory.createOrder(cust, LocalDate.now());
        CustOrderFactory.createItem(order2, "Pants");
        CustOrderFactory.createItem(order2, "Knife set");

        System.out.println(cust.getOrders());
    }
}
