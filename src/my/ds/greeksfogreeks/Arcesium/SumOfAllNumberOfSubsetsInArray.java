package my.ds.greeksfogreeks.Arcesium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumOfAllNumberOfSubsetsInArray {

    public static List<Integer> getSubsets(int[] nums) {
        int limit = (int) Math.pow(2, nums.length);
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < limit; i++) {
            int sum = 0;
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
            ans.add(sum);
        }

        return ans;
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 5};
        List<Integer> ans = getSubsets(num);
        Collections.sort(ans);
        ans.stream().forEach(System.out::println);
    }
}
