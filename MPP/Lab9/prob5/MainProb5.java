package prob5;

import java.util.*;
import java.util.function.*;

public class MainProb5 {

    enum SortMethod {BYNAME, BYSALARY}

    private final Function<Employee, String> nameFunction = Employee::getName;
    private final Function<Employee, Integer> salaryFunction = Employee::getSalary;

    final Pair<Function, Function> byNamePair = new Pair<>(nameFunction, salaryFunction);
    final Pair<Function, Function> bySalaryPair = new Pair<>(salaryFunction, nameFunction);

    final HashMap<SortMethod, Pair<Function, Function>> sortMethodPairHashMap =
            new HashMap<SortMethod, Pair<Function, Function>>() {
                {
                    put(SortMethod.BYNAME, byNamePair);
                    put(SortMethod.BYSALARY, bySalaryPair);
                }
            };

    private void sort(List<Employee> employees, SortMethod method) {
        Collections.sort(employees, Comparator.comparing(sortMethodPairHashMap.get(method).first).
                thenComparing(sortMethodPairHashMap.get(method).second));
        System.out.println(employees);
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("Joe", 100000), new Employee("Tim", 50000), new Employee("Andy", 60000));
        new MainProb5().sort(employees, SortMethod.BYNAME);
        new MainProb5().sort(employees, SortMethod.BYSALARY);
    }


    static class Pair<S, F> {
        S first;
        F second;

        Pair(S first, F second) {
            this.first = first;
            this.second = second;
        }
    }
}
