package prob4;

import java.time.LocalDate;

final public class CustOrderFactory {

    private CustOrderFactory(){}

    public static Order createOrder(Customer customer, LocalDate date) {
        Order order = Order.newOrder(customer, date);
        return order;
    }

    public static Customer createCustomer(String customerName) {

        Customer customer = new Customer(customerName);
        return customer;
    }

    public static void createItem(Order order, String itemName) {
        order.addItem(itemName);
    }
}
