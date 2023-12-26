package my.ds.letcode.essay.Arrays;

public class BuildArrayFromPermutation {

    public int[] buildArray(int[] nums) {
        /*int len = nums.length;
        for (int i = 0; i < len; i++){
            nums[i] = nums[i] + (len*(nums[nums[i]]%len));
        }
        for (int i = 0; i < len; i++){
            nums[i]/=len;
        }
        return nums;*/
        int [] arr  = new int[nums.length];

        for (int i =0; i<nums.length;i++){
            arr[i] = nums[nums[i]];
        }
        return arr;
    }

    public static void main( String []arg){
        int inputArr[] = {5,0,1,2,3,4};
        BuildArrayFromPermutation arrayFromPermutation = new BuildArrayFromPermutation();
        int result[] = arrayFromPermutation.buildArray(inputArr);

        for (int i = 0; i < result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
