package prob5.soln2;

import prob5.Employee;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LibraryCompanion {

    static Function<List<Employee>, List<Employee>> salaryGreaterThan100000 = list -> list.stream()
            .filter(e -> (e.getSalary() > 100000))
            .collect(Collectors.toList());

    static Function<List<Employee>, String> lastNameAfterM = list -> list.stream()
            .filter(e -> (e.getLastName().charAt(0) > 'M'))
            .map(e -> fullName(e))
            .sorted()
            .collect(Collectors.toList())
            .toString();

    private static String fullName(Employee e) {
        return e.getFirstName() + " " + e.getLastName();
    }
}
