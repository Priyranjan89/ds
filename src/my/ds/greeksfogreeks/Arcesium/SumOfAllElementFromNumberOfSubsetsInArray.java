package my.ds.greeksfogreeks.Arcesium;

import java.util.ArrayList;
import java.util.List;

public class SumOfAllElementFromNumberOfSubsetsInArray {

    public static int getSubsets(int[] nums) {
        int limit = (int) Math.pow(2, nums.length);
        int sum = 0;

        for (int i = 0; i < limit; i++) {
            List<Integer> current = new ArrayList<>();
            int temp = i;

            for (int j = nums.length - 1; j >= 0; j--) {
                int rem = temp % 2;
                temp = temp / 2;

                if (rem == 0) {
                    continue;
                } else {
                    current.add(nums[j]);
                }
            }
            for (Integer value : current) {
                sum = sum + value;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int num[] = {1, 2, 3};
        System.out.println(getSubsets(num));
    }
}
