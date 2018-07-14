package lambdalib;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import quizclasses.Employee;
import quizclasses.Pair;
import quizclasses.Trader;
import quizclasses.Transaction;


public class LambdaLibrary {

    public final static TriFunction<List<Employee>, Integer, Integer, List<Pair>> PROBLEM1
            = (list, lower, upper) -> list.stream()
            .filter(e -> e.getSalary() > lower && e.getSalary() < upper)
            .sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary))
            .map(e -> new Pair(e.getName(), e.getSalary()))
            .collect(Collectors.toList());


    public final static BiFunction<List<Transaction>, Integer, List<Transaction>> PROBLEM2
            = (inputList, year) -> inputList.stream()
            .filter(t -> t.getYear() == 2011)
            .sorted(Comparator.comparing(transaction -> transaction.getValue()))
            .collect(Collectors.toList());




    public final static BiFunction<List<Transaction>, String, List<Trader>> PROBLEM3
            = (inputList, city) -> inputList.stream()
            .map(transaction -> transaction.getTrader())
            .filter(trader -> trader.getCity() == "Cambridge")
            .sorted(Comparator.comparing(Trader::getName))
            .collect(Collectors.toList());

    // Example query
    public final static TriFunction<List<Employee>, Integer, Integer, List<Employee>> SAMPLE
            = (list, namelength, year) -> list.stream()
            .filter(e -> e.getName().length() > namelength)
            .filter(e -> e.getYearOfBirth() > year)
            .collect(Collectors.toList());
}

/*list.stream()
        .filter(e -> e.getSalary() > 55000 && e.getSalary() < 120000)
        .sorted(Comparator.comparing(byName).thenComparing(bySalaryReversed))
        .map(e -> e.getName() + ", " + e.getSalary())*/
