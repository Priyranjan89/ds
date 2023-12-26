package my.ds.hackerrank;

import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {

        List<Integer> row1 = Arrays.asList(1,2,3,2);
        List<Integer> row2 = Arrays.asList(4,5,6,7);
        List<Integer> row3 = Arrays.asList(9,8,9,5);
        List<Integer> row4 = Arrays.asList(9,8,9,6);

        List<List<Integer>> matrix = Arrays.asList(row1,row2,row3,row4);
        System.out.println(diagonalDifference(matrix));

    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int right =0;
        int left=0;
        for (int i = 0; i<arr.size();i++){
            for (int j = 0; j<arr.size(); j++){
                if (i == j){
                    right += arr.get(i).get(j);
                }
                if (i+j == arr.size()-1){
                    left += arr.get(i).get(j);
                }
            }
        }

        return Math.abs(right-left);
    }
}
