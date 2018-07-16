package prob5.soln1;

import org.junit.Test;
import prob5.Employee;
import prob5.Main;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestClass {

    @Test
    public void asString() {

        List<Employee> input1 = Arrays.asList(new Employee("Joe", "Davis", 120000),
                new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000),
                new Employee("Meles", "Zenawi", 150000));

        String result1 = new Main().asString(input1);
        assertEquals("Alice Richards, Joe Stevens, John Sims, Meles Zenawi, Steven Walters", result1);

        List<Employee> input2 = Arrays.asList(new Employee("Joe", "Davis", 120000),
                new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Donald", "Trump", 100000),
                new Employee("Meles", "Zenawi", 150000));

        String result2 = new Main().asString(input2);
        assertEquals("Joe Stevens, John Sims, Meles Zenawi", result2);

    }

}
