/*
* Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.

The value of |x| is defined as:

x if x >= 0.
-x if x < 0.


Example 1:

Input: nums = [1,2,2,1], k = 1
Output: 4
Explanation: The pairs with an absolute difference of 1 are:
- [1,2,2,1]
- [1,2,2,1]
- [1,2,2,1]
- [1,2,2,1]*/

package my.ds.letcode.essay.Arrays;

public class CountNumberOfPairsWithAbsoluteDifferenceK {

    public static int countKDifference(int[] nums, int k) {
        int result = 0;

        for (int i = 0; i<nums.length; i++){
            for (int j=i;j<nums.length;j++){
                if (Math.abs(nums[i] - nums[j]) == k){
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {3,2,1,5,4};
        int k = 2;
        int result = countKDifference(nums, k);
        System.out.println(result);
    }
}
