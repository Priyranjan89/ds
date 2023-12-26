package my.ds.letcode.medium;

import java.util.ArrayList;
import java.util.List;

public class ThreeNumberSumInArrays {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> threeSum = new ArrayList<>();

        for (int i =0; i<nums.length;i++){
            for (int j =i+1; j<nums.length;j++){
                List<Integer> listOdSum =new ArrayList<>();
                for (int k =j+1; k<nums.length;k++){
                    if ((nums[k] + nums[j] + nums[i]) == 0){
                        listOdSum.add(nums[i]);
                        listOdSum.add(nums[j]);
                        listOdSum.add(nums[k]);
                    }
                }
                if (!listOdSum.isEmpty()){
                    threeSum.add(listOdSum);
                }
            }

        }
        return threeSum;

    }

    public static void main(String[] args) {
        int arr[] = {12, 3, 1, 2, -6, 5, -8, 6};

        List<List<Integer>> threeSum = threeSum(arr);
        threeSum.stream().forEach(System.out::println);
        //Output: [[-1,-1,2],[-1,0,1]]
    }
}
