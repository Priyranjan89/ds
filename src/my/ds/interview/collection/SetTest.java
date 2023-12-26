package my.ds.interview.collection;

import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;

public class SetTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Ranjan", new Address("pune",asList(967613243, 708234515)));
        Employee employee2 = new Employee(1, "Ranjan", new Address("pune",asList(967613243, 708234515)));
        Employee employee3 = new Employee(1, "Ranjan", new Address("pune",asList(967613243, 708234515)));
        Employee employee4 = new Employee(3, "Deepak", new Address("pune",asList(957613246, 758234518)));
        Employee employee5 = new Employee(3, "Mahesh", new Address("pune",asList(997613247, 768234519)));
        Employee employee6 = new Employee(1, "Xyz", new Address("pune",asList(957713248, 950234520)));


        Set<Employee> employees = new HashSet<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);

        System.out.println(employees.size());
        employees.forEach(System.out::println);
    }
}
