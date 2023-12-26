package my.ds.hackerrank;

import java.util.Arrays;
import java.util.List;

public class LonelyInteger {
    public static int lonelyinteger(List<Integer> a) {
        int uniqueValue = 0;

        for (int i = 0; i < a.size(); i++) {
            uniqueValue = uniqueValue ^ a.get(i);
        }
        return uniqueValue;
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,3,2,1);
        System.out.println(lonelyinteger(list));
    }
}
