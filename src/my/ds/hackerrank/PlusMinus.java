package my.ds.hackerrank;

import java.util.List;

import static java.lang.String.format;
import static java.util.Arrays.asList;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        double positive = 0;
        double negative = 0;
        double zeros = 0;
        double length = arr.size();

        for (int i = 0; i<arr.size(); i++){
            if(arr.get(i) < 0){
                negative++;
            } else if (arr.get(i) > 0){
                positive++;
            } else {
                zeros++;
            }
        }
        System.out.println(format("%.6f", (positive/length)));
        System.out.println(format("%.6f", (negative/length)));
        System.out.println(format("%.6f", (zeros/length)));
    }

    public static void main(String[] args) {

        plusMinus(asList(-4, 3, -9, 0, 4, 1));
    }
}
