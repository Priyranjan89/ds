package my.ds.interview.collection;

import java.util.TreeMap;

import static java.util.Arrays.asList;

public class TreeMapTest {

    public static void main(String[] args) {

        Emp employee1 = new Emp("Ranjan","pune");
        Emp employee2 = new Emp("PSingh", "pune");
        Emp employee3 = new Emp("Aman","mumbai");
        Emp employee4 = new Emp("Deepak","mumbai");
        Emp employee5 = new Emp("Mahesh","pune");
        Emp employee6 = new Emp("Deepak", "pune");

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(11, "audi");
        treeMap.put(null, null);
        treeMap.put(11, "BMW");
        treeMap.put(null, "fer");

       treeMap.entrySet().stream().forEach(System.out::println);

    }
}
