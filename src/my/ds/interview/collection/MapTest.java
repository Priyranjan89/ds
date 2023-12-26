package my.ds.interview.collection;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class MapTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Ranjan", new Address("pune",asList(967613243, 708234515)));
        Employee employee2 = new Employee(2, "PSingh", new Address("pune",asList(867613244, 709234516)));
        Employee employee3 = new Employee(3, "Aman", new Address("mumbai",asList(767613245, 608234517)));
        Employee employee4 = new Employee(4, "Deepak", new Address("pune",asList(957613246, 758234518)));
        Employee employee5 = new Employee(5, "Mahesh", new Address("pune",asList(997613247, 768234519)));
        Employee employee6 = new Employee(6, "Deepak", new Address("pune",asList(957713248, 950234520)));

        getHaspMapUsingStream(employee1, employee2, employee3, employee4, employee5, employee6);
        //getListUsingStream(employee1, employee2, employee3, employee4, employee5, employee6);


    }

    private static void getHaspMapUsingStream(Employee employee1,
                                              Employee employee2,
                                              Employee employee3,
                                              Employee employee4,
                                              Employee employee5,
                                              Employee employee6) {
        Map<Employee, Integer> map = new HashMap<>();
        map.put(employee1, 2020);
        map.put(employee2, 2018);
        map.put(employee3, 2021);
        map.put(employee4, 2022);
        map.put(employee5, 2019);
        map.put(employee6, 2021);


        map.forEach((key, value) -> System.out.println(key+ " :        "+value));
        System.out.println("\n");

        System.out.println("Name of who joined in year");
        List<Employee> employees = map.entrySet()
                .stream()
                .filter(value -> (value.getValue() >=2020))
               // .filter(name -> name.getKey().getName() == "Deepak")
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        employees.forEach(System.out::println);

        List<List<Integer>> employeePhone = map.entrySet()
                .stream()
                .filter(value -> (value.getKey().getId() % 2 == 0))
                .map(value -> value.getKey().getAddress().getPhoneNumber())
                .collect(Collectors.toList());
        System.out.println("Phone number for even number Employee");
        employeePhone.forEach(System.out::println);

        /*Optional<Employee> employeeName = map.entrySet()
                .stream()
                .filter(name -> name.getKey().getName() == "Singh")
                .map(Map.Entry::getKey)
                .findAny();
        System.out.println("\n Printing object value");
        System.out.println(employeeName.toString());*/
    }

    private static void getListUsingStream(Employee employee1,
                                              Employee employee2,
                                              Employee employee3,
                                              Employee employee4,
                                              Employee employee5,
                                              Employee employee6) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        System.out.println("\n List operation started");

        employeeList.forEach(System.out::println);


       /* List<Address> empPhone = employeeList
                .stream()
                .filter(employee -> employee.getId() % 2 == 0)
                .map(employee -> employee.getAddress())
                .collect(Collectors.toList());
        System.out.println("\n");

        for (Address address : empPhone){
            System.out.println("Employee phone number:  "+address.getPhoneNumber());
        }*/

        List<List<Integer>> employeePhone = employeeList
                .stream()
                .filter(employee -> employee.getId() % 2 == 0)
                .map(employee -> employee.getAddress().getPhoneNumber())
                .collect(Collectors.toList());

        System.out.println("\n Printing phone number");

        employeePhone.forEach(System.out::println);

        System.out.println("\n Printing even employee id phone number");
        employeeList
                .stream()
                .filter(employee -> employee.getId() % 2 == 0)
                .map(employee -> employee.getAddress().getPhoneNumber()).forEach(System.out::println);

    }

    private static List<Integer> getPhoneNumber(Address address) {
        return address.getPhoneNumber();
    }

}
