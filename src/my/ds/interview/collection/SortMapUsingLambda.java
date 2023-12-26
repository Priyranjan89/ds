package my.ds.interview.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class SortMapUsingLambda {

    public static void main(String[] args) {
        Employee employee1 = new Employee(6, "Ranjan", new Address("pune",asList(967613243, 708234515)));
        Employee employee2 = new Employee(2, "PSingh", new Address("pune",asList(867613244, 709234516)));
        Employee employee3 = new Employee(3, "Aman", new Address("mumbai",asList(767613245, 608234517)));
        Employee employee4 = new Employee(1, "Deepak", new Address("pune",asList(957613246, 758234518)));
        Employee employee5 = new Employee(5, "Mahesh", new Address("pune",asList(997613247, 768234519)));
        Employee employee6 = new Employee(4, "Deepak", new Address("pune",asList(957713248, 950234520)));

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);

        System.out.println("Before Sorting");
        employeeList.forEach(System.out::println);
        Collections.sort(employeeList,(emp1, emp2) -> (emp1.getId() > emp2.getId()) ? -1 : (emp1.getId() < emp1.getId()) ? 1 : 0);
        System.out.println("After Sorting");
        employeeList.forEach(System.out::println);
    }
}
