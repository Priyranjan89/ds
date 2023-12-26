package my.ds.greeksfogreeks.Arcesium;

import java.util.ArrayList;
import java.util.List;

public class ProductOfTheMaximumsNumberOfSubsetsInArray {
    public static int getSubsets(int[] nums) {
        int limit = (int) Math.pow(2, nums.length);
        int mul = 1;

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
            int maxValue = 1;
            for (int k = 0; k <current.size(); k++){
                if (current.get(k) > maxValue){
                    maxValue = current.get(k);
                }
            }
            mul =mul*maxValue;
        }

        return mul;
    }

    public static void main(String[] args) {
        int num[] = {1, 2, 3};
        System.out.println(getSubsets(num));
    }
}
