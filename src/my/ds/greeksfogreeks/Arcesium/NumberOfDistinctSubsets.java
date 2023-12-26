package my.ds.greeksfogreeks.Arcesium;

import java.util.ArrayList;
import java.util.List;

public class NumberOfDistinctSubsets {

    public static List<List<Integer>> getSubsets(int[] nums) {
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        recursive(nums, 0, current, ans);
        return ans;
    }

    private static void recursive(int[] nums, int i, List<Integer> current, List<List<Integer>> ans) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[i]);
        recursive(nums, i + 1, current, ans);
        current.remove(current.size() - 1);
        recursive(nums, i + 1, current, ans);
    }

    public static void main(String[] args) {
        int num[] = {1, 2, 3};
        List<List<Integer>> result = getSubsets(num);
        result.stream().forEach(System.out::println);
    }
}
