package my.ds.letcode.essay.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        int[] num = {1, 2, 5, 2, 3};
        int target = 2;

        List<Integer> list = targetIndices(num, target);

        System.out.print("[");
        for (Integer n : list) {
            System.out.print(n + " ");
        }
        System.out.print("]");
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                list.add(i);
            }
        }
        return list;
    }
}
