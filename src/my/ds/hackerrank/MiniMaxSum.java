/*Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Example

The minimum sum is  and the maximum sum is . The function prints*/
package my.ds.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        long max = 0;
        long min = 0;
        Collections.sort(arr);
        for (int i = 0; i<arr.size();i++){
            if (i <arr.size()-1){
                min +=arr.get(i);
            }
            if (i>0){
                max +=arr.get(i);
            }
        }
        System.out.println(min+" "+max);
    }

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(254961783, 604179258, 462517083, 967304281, 860273491);
        miniMaxSum(integers);
    }
}
