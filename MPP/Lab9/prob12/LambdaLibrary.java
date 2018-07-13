package prob12;

import prob11.sectionB.TriFunction;
import java.util.List;

public class LambdaLibrary {

    public static final TriFunction<List<Employee>, Character, Integer, Long> EMPLOYEE_COUNTS = (employees, nameChar, salary ) ->
            employees.stream()
                    .filter(e -> e.getSalary() > salary)
                    .filter(emp -> emp.getLastName().charAt(0) > nameChar)
                    .count();

    public static final TriFunction<List<Employee>, Character, Integer, String> NAMES_IN_EMPLOYEES = (employees, nameChar, salary ) ->
            employees.stream()
                    .filter(e -> e.getSalary() > salary)
                    .filter(emp -> emp.getFirstName().charAt(0) < nameChar)
                    .map(emp -> emp.getFirstName().toUpperCase() + " " + emp.getLastName().toUpperCase())
                    .sorted()
                    .reduce((fn, ln) -> (fn + "," + ln)).get();
}
