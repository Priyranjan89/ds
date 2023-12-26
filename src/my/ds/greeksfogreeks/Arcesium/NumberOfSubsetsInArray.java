package my.ds.greeksfogreeks.Arcesium;

import java.util.ArrayList;
import java.util.List;

public class NumberOfSubsetsInArray {

    public static List<List<Integer>> getSubsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        int limit = (int) Math.pow(2, nums.length);

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
            ans.add(current);
        }

        return ans;
    }

    public static void main(String[] args) {
        int num[] = {1, 2, 3};
        List<List<Integer>> result = getSubsets(num);
        result.stream().forEach(System.out::println);
    }
}
