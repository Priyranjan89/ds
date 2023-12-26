package my.ds.letcode.essay.Arrays;

import java.util.*;

public class MaximumProductDifferenceBetweenTwoPairs {

    public static int maxProductDifference(int[] nums) {

        /*Arrays.sort(nums);
        List<Integer> arr = new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }
        int size = arr.size()-1;
        return ((arr.get(size)*arr.get(size-1)) -(arr.get(0)*arr.get(1)));*/

        Arrays.sort(nums);
        int size = nums.length-1;
        return ((nums[size]*nums[size-1]) -(nums[0]*nums[1]));
    }

    public static void main(String[] args) {

        int nums[] = {4,2,5,9,7,4,8};

        int result = maxProductDifference(nums);
        System.out.println(result);
    }
}
