package my.ds.interview;

import java.util.*;
import java.util.stream.Collectors;

public class SortedArray {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,3,4,100,99,1,100,99);

        /*Set<Integer> sets = new TreeSet<>(list);
        System.out.println(sets);*/

        TreeSet<Integer> set = list.stream().collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set);



    }
}
