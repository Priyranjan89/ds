/*Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.

DevidArrayAsTeamWithBasedOnSkill subarray is a contiguous subsequence of the array.

Return the sum of all odd-length subarrays of arr.



Example 1:

Input: arr = [1,4,2,5,3]
Output: 58
Explanation: The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15
If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58*/
package my.ds.letcode.essay.Arrays;

public class SumOfAllOddLengthSubArrays {

    public static int sumOddLengthSubArrays(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j += 2) {
                for (int k = i; k <= j; k++) {
                    result += arr[k];
                }
            }
        }
        return result;

        /*int[] presum = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            presum[i + 1] = presum[i] + arr[i];
        }

        int res = 0;
        // Enumerator array length
        for (int i = 1; i <= arr.length; i += 2) {
            //  Enumerate left endpoint
            for (int j = 0; j + i - 1 < arr.length; j++) {
                res += presum[j + i] - presum[j];
            }
        }
        return res;*/
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 5, 3};
        int result = sumOddLengthSubArrays(arr);
        System.out.println(result);
    }
}
