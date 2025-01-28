package functional_programming.problems;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employees=List.of(
                new Employee("Ajay1",1000),
                new Employee("Ajay2",2000),
                new Employee("Ajay3",3000),
                new Employee("Ajay4",4000),
                new Employee("Ajay5",5000));

        employees.stream().sorted((e1,e2)->Integer.compare(e1.getSalary(), e2.getSalary()))
                .forEach(System.out::println);

    }
}
