package prob5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;


public class EmployeeProb5 {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    int salary;

    public EmployeeProb5(String n, int s) {
        this.name = n;
        this.salary = s;
    }

    @Override
    public String toString() {
        return "[" + name + ", " + salary + "]";
    }

    public static void main(String[] args) {
        List<EmployeeProb5> list = new ArrayList<EmployeeProb5>() {
            {
                add(new EmployeeProb5("Joe", 50000));
                add(new EmployeeProb5("Jim", 75000));
                add(new EmployeeProb5("Tom", 80000));
                add(new EmployeeProb5("Jim", 70000));
                add(new EmployeeProb5("Steve", 55000));
                add(new EmployeeProb5("Jim", 100000));
                add(new EmployeeProb5("Joe", 59000));
                add(new EmployeeProb5("Rich", 88000));
            }
        };

        Function<EmployeeProb5, String> byName = e -> e.getName();
        Function<EmployeeProb5, Integer> byBalance = e -> e.getSalary();

        //sorting code here
        list.sort(Comparator.comparing(byName).thenComparing(Comparator.comparing(byBalance).reversed()));
        list.forEach(System.out::println);

        //expected output:
        //[[Jim, 100000], [Jim, 75000], [Jim, 70000], [Joe, 59000], [Joe, 50000], [Rich, 88000], [Steve, 55000], [Tom, 80000]]
        //System.out.println(/*implement */);
    }
}

