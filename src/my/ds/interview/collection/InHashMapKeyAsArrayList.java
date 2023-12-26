package my.ds.interview.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.util.Arrays.asList;

public class InHashMapKeyAsArrayList {

    public static void main(String[] args) {
        Employee employee1 = new Employee(6, "Ranjan", new Address("pune",asList(967613243, 708234515)));
        Employee employee2 = new Employee(2, "PSingh", new Address("pune",asList(867613244, 709234516)));
        Employee employee3 = new Employee(3, "Aman", new Address("mumbai",asList(767613245, 608234517)));
        Employee employee4 = new Employee(1, "Deepak", new Address("pune",asList(957613246, 758234518)));
        Employee employee5 = new Employee(5, "Mahesh", new Address("pune",asList(997613247, 768234519)));
        Employee employee6 = new Employee(4, "Deepak", new Address("pune",asList(957713248, 950234520)));

        ArrayList<Employee> employeeList1 = new ArrayList<>();
        employeeList1.add(employee1);
        employeeList1.add(employee2);

        ArrayList<Employee> employeeList2 = new ArrayList<>();
        employeeList2.add(employee3);
        employeeList2.add(employee4);

        ArrayList<Employee> employeeList3 = new ArrayList<>();
        employeeList3.add(employee5);
        employeeList3.add(employee6);

        ArrayList<Employee> employeeList4 = employeeList3;

        HashMap<ArrayList<Employee>, String> employeeHashMap = new HashMap<>();

        employeeHashMap.put(employeeList1, "First List");
        employeeHashMap.put(employeeList2, "Second List");
        employeeHashMap.put(employeeList3, "Third List");
        employeeHashMap.put(employeeList4, "Third List");

        employeeHashMap.entrySet().stream().forEach(System.out::println);
    }
}
