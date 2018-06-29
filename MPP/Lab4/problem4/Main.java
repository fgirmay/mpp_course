package problem4;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fissehaye on 6/28/18.
 */
public class Main {

    public static void main(String[] args) {



        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Hourly(1, 50, 40);
        Employee employee2 = new Salaried(2, 10000);



        List<Order> orders1 = new ArrayList<>();
        Order order1 = new Order(1, LocalDate.now(), 20000);
        Order order2 = new Order(1, LocalDate.now(), 20000);
        orders1.add(order1);
        orders1.add(order2);
        Employee employee3 = new Commissioned(3,4500, 0.05, orders1);


        List<Order> orders2 = new ArrayList<>();
        Order order3 = new Order(1, LocalDate.now(), 20000);
        Order order4 = new Order(1, LocalDate.now(), 20000);
        orders2.add(order3);
        orders2.add(order4);
        Employee employee4 = new Commissioned(4, 6000, 0.04, orders2);


        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        for(Employee employee : employees) {
            employee.print();
        }

    }
}
