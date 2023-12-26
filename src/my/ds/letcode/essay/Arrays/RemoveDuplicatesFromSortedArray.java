package my.ds.letcode.essay.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int index = 1;

        for (int i =1; i<nums.length;i++){
            if (nums[i-1] != nums[i]){
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int num[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(num));
    }
}
