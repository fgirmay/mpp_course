package pipeline;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import quizclasses.*;

/**
 * USE STREAM PIPELINES TO SOLVE THE PROBLEMS HERE
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Sample Query");
        List<Employee> sampleData = EmployeeTestData.getList();
        // Example of desired style:
        // This create a stream pipeline that does the following:
        // Print all Employee records for which name has length > 5 and birth
        // year is > 1970
        List<Employee> result = sampleData.stream().filter(e -> e.getName().length() > 5)
                .filter(e -> e.getYearOfBirth() > 1970).collect(Collectors.toList());
        System.out.println(result);

        prob1();
        prob2();
        prob3();
    }

    // Problem 1
    // Create a stream pipeline that obtains a list of
    // all name/salary pairs extracted from a list of Employees
    // for which salary > 55000 and less than 120000, in ascending
    // order of name, then descending order of salary
    // Then print the list to the console
    public static void prob1() {

        Function<Employee, String> byName = e -> e.getName();
        Function<Employee, Integer> bySalaryReversed = e -> e.getSalary();

        //sorting code here

        // use this list
        List<Employee> list = EmployeeTestData.getList();


        System.out.println(list.stream()
                                .filter(e -> e.getSalary() > 55000 && e.getSalary() < 120000)
                                .sorted(Comparator.comparing(byName).thenComparing(bySalaryReversed))
                                .map(e -> new Pair(e.getName(), e.getSalary()))
                                .collect(Collectors.toList()));

    }

    // Problem 2
    // Create a stream pipeline to find all transactions from year 2011
    // and sort them by value (small to high), and print to console
    // (Note: there is an instance variable "value" in Transaction)
    public static void prob2() {
        // use this list
        List<Transaction> list = TraderTransactTestData.getTransactions();

        System.out.println(list.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(transaction -> transaction.getValue()))
                .collect(Collectors.toList()));
    }

    // Problem 3
    // Create a stream pipeline to find all traders from Cambridge,
    // sort them by name, and print to console
    public static void prob3() {
        // Use this list
        List<Transaction> list = TraderTransactTestData.getTransactions();

        System.out.println(list.stream()
                                .map(transaction -> transaction.getTrader())
                                .filter(trader -> trader.getCity() == "Cambridge")
                                .sorted(Comparator.comparing(Trader::getName))
                                .collect(Collectors.toList()));

    }
}
