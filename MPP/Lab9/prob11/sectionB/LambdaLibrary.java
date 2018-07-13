package prob11.sectionB;

import java.util.List;

public class LambdaLibrary {

    public static final TriFunction<List<Employee>, Character, Integer, String> NAMES_IN_EMPLOYEES = (employees, nameChar, salary ) ->
            employees.stream()
                    .filter(e -> e.getSalary() > salary)
                    .filter(emp -> emp.getLastName().charAt(0) > nameChar)
                    .map(emp -> emp.getFirstName() + " " + emp.getLastName())
                    .sorted()
                    .reduce((fn, ln) -> (fn + "," + ln)).get();
}
