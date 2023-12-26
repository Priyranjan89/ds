package my.ds.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SparseArrays {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            int count = 0;
            for (int j = 0; j < strings.size(); j++) {
                if (queries.get(i).equals(strings.get(j))) {
                    count++;
                }
            }
            result.add(i, count);
        }
        return result;
    }


    public static void main(String[] args) {

        List<String> strings = Arrays.asList("abcde", "sdaklfj", "asdjf", "na", "basdn",
                "sdaklfj", "asdjf", "na", "asdjf", "na", "basdn", "sdaklfj", "asdjf");

        List<String> queries = Arrays.asList("abcde", "sdaklfj", "asdjf", "na", "basdn");

        List<Integer> result = matchingStrings(strings, queries);

        result.forEach(System.out::println);
    }
}
