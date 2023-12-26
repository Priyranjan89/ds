package my.ds.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysChallangeForMorgan {

    public static List<Long> arrayChallenge(List<Long> arr) {
        List<Long> result = new ArrayList<>();
        for (int i = 0; i<arr.size(); i++){
            Long total = 0l;
            for (int j = 0; j<i; j++){
                total +=arr.get(i) - arr.get(j);
            }
            result.add(total);
        }
        return result;
    }
    public static void main(String[] args) {
        List<Long> list = Arrays.asList(2l,1l,3l);

        List<Long> result = arrayChallenge(list);

        result.stream().forEach(System.out::println);
    }
}
