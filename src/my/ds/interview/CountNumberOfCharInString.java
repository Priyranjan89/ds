package my.ds.interview;/*
 * Priyaranjan
 * p - 1, r-2, a-3
 * */

import java.util.LinkedHashMap;
import java.util.Map;

public class CountNumberOfCharInString {
    public static void main(String[] args) {

        String str = "priyaranjan";

        Map<Character, Integer> map = new LinkedHashMap<>();
        int val = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                val = map.get(ch).intValue();
                val++;
                map.put(ch, val);
            } else {
                map.put(ch, 1);
            }

        }
        map.entrySet().stream().forEach(System.out::println);

    }
}
