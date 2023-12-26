package my.ds.interview.collection;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(2);
       /* treeSet.add(1);
        treeSet.add(3);*/
        treeSet.add(6);
        treeSet.add(5);

        treeSet.forEach(System.out::println);
        System.out.println("\n");
        System.out.println(treeSet.pollFirst());
       // treeSet.pollFirst()
        System.out.println("\n");
        treeSet.forEach(System.out::println);
    }
}
