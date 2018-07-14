package innerclass;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import quizclasses.*;

/**
 * SOLVE THE PROBLEMS HERE BY REPLACING LAMBDA EXPRESSIONS IN YOUR PIPELINE
 * SOLUTIONS WITH LOCAL INNER CLASSES
 */
public class Main {
    public static void main(String[] args) {

        // Example of desired style:
        // Using local inner classes to replace lambdas in your pipeline
        // solution
        // to this sample problem:
        // Print all Employee records for which name has length > 5 and birth
        // year is > 1970

        class NameLength implements Predicate<Employee> {
            public boolean test(Employee e) {
                return e.getName().length() > 5;
            }
        }
        class BirthYear implements Predicate<Employee> {
            public boolean test(Employee e) {
                return e.getYearOfBirth() > 1970;
            }
        }
        System.out.println("Sample Query");
        List<Employee> sampleData = EmployeeTestData.getList();

        List<Employee> result = sampleData.stream().filter(new NameLength()).filter(new BirthYear())
                .collect(Collectors.toList());
        System.out.println(result);

        prob1();
        prob2();
        prob3();
    }

    // Problem 1
    // Transform your pipeline solution to prob1 in the pipeline package so that
    // every lambda is replaced by an instance of a
    // local inner class of the correct type
    public static void prob1() {
        // use this list
        List<Employee> list = EmployeeTestData.getList();


        Function<Employee, String> byName = e -> e.getName();
        Function<Employee, Integer> bySalaryReversed = e -> e.getSalary();

        //sorting code here

        List<Pair> result =
                list.stream()
                        .filter(new Predicate<Employee>(){
                            @Override
                            public boolean test(Employee e) {
                                return e.getSalary() > 55000 && e.getSalary() < 120000;
                            }
                        })
                        .sorted(new Comparator<Employee>() {
                            @Override
                            public int compare(Employee o1, Employee o2) {
                                return o1.getName().compareTo(o2.getName());
                            }
                        })
                        .map(e -> new Pair(e.getName(), e.getSalary()))
                        .collect(Collectors.toList());

        System.out.println(result);

    }

    // Problem 2
    // Transform your pipeline solution to prob2 so that
    // every lambda is replaced by an instance of a
    // local inner class of the correct type
    public static void prob2() {
        // use this list
        List<Transaction> list = TraderTransactTestData.getTransactions();
        List<Transaction> result =
                list.stream()
                        .filter(new Predicate<Transaction>(){
                            @Override
                            public boolean test(Transaction t) {
                                return t.getYear() == 2011;
                            }
                        })
                        .sorted(new Comparator<Transaction>() {
                            @Override
                            public int compare(Transaction t1, Transaction t2) {
                                return Integer.compare(t1.getValue(), t2.getValue());
                            }
                        })
                        .collect(Collectors.toList());

        System.out.println(result);
    }

    // problem 3
    // Transform your pipeline solution to prob3 so that
    // every lambda is replaced by an instance of a
    // local inner class of the correct type
    public static void prob3() {

        List<Transaction> list = TraderTransactTestData.getTransactions();

        class CambridgeCity implements Predicate<Trader> {
            @Override
            public boolean test(Trader trader) {
                return trader.getCity() == "Cambridge";
            }
        }

        List<Transaction> result = list.stream()
                .filter(new Predicate<Transaction>(){
            @Override
            public boolean test(Transaction t) {
                return t.getTrader().getCity() == "Cambridge";
            }
        }).collect(Collectors.toList());
        System.out.println(result);

    }
}
