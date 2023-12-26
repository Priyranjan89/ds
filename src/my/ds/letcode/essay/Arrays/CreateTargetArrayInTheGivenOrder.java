package my.ds.letcode.essay.Arrays;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArrayInTheGivenOrder {

    public int[] createTargetArray(int[] nums, int[] index) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i],nums[i]);
        }
        int result[] = new int[list.size()];

        for (int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = {0, 1, 2, 3, 4};
        int index[] = {0, 1, 2, 2, 1};

        CreateTargetArrayInTheGivenOrder arrayInTheGivenOrder = new CreateTargetArrayInTheGivenOrder();
        int result[] = arrayInTheGivenOrder.createTargetArray(nums, index);

        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.print("]");
    }
}
