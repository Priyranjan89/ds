package my.ds.interview.collection;

import java.util.HashMap;
import java.util.TreeMap;

import static java.util.Arrays.asList;

public class HashMapTest {
    public static void main(String[] args) {

      /*  HashMap<String, String> hashMap= new HashMap<>();
        hashMap.put(null, null);
        hashMap.put("xyz", "xyz");
        hashMap.put(null, "xyz");
        hashMap.entrySet().forEach(System.out::println);

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(4, "abc");
        treeMap.put(1, "abc");
        treeMap.put(5, "abc");
        treeMap.put(3, "abc");
        treeMap.put(7, "abc");
        treeMap.put(2, "abc");
        treeMap.entrySet().forEach(System.out::println);*/

        String input = "create_parking_lot 6";
        String str[] = input.split("\\s");

        if (str[0].equals("create_parking_lot")) {
            String createParking = str[0];
            int value = Integer.valueOf(str[1]);
            System.out.println(createParking+" "+value);
        }



        Employee employee1 = new Employee(1, "Ranjan", new Address("pune", asList(967613243, 708234515)));
        Employee employee2 = new Employee(2, "PSingh", new Address("pune", asList(867613244, 709234516)));
        Employee employee3 = new Employee(3, "Aman", new Address("mumbai", asList(767613245, 608234517)));
        Employee employee4 = new Employee(4, "Deepak", new Address("pune", asList(957613246, 758234518)));
        Employee employee5 = new Employee(5, "Mahesh", new Address("pune", asList(997613247, 768234519)));
        Employee employee6 = new Employee(6, "Deepak", new Address("pune", asList(957713248, 950234520)));
        Employee employee7 = new Employee(7, "Somya", new Address("pune", asList(957713248, 950234520)));


        HashMap<Integer, Employee> hashMap = new HashMap<>(6);

        hashMap.put(1, employee1);
        hashMap.put(2, employee2);
        hashMap.put(3, employee3);
        hashMap.put(4, employee4);
        hashMap.put(5, employee5);
        hashMap.put(6, employee6);


        hashMap.forEach((key, value) -> System.out.println(key + " :        " + value));

        System.out.println("\n");
        hashMap.remove(4);

        hashMap.forEach((key, value) -> System.out.println(key + " :        " + value));

        hashMap.put(4, employee7);

        System.out.println("\n");
        hashMap.forEach((key, value) -> System.out.println(key + " :        " + value));
    }
}
