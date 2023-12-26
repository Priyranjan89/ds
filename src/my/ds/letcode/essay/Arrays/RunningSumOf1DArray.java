package my.ds.letcode.essay.Arrays;

public class RunningSumOf1DArray {

    public int[] runningSum(int[] nums) {
        int sum = 0;
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            sum = sum+nums[i];
            arr[i] = sum;
        }
        return arr;
    }

    public static void main( String []arg){
        int inputArr[] = {1,3,4,6,5};
        RunningSumOf1DArray sumOf1DArray = new RunningSumOf1DArray();
        int result[] = sumOf1DArray.runningSum(inputArr);
        System.out.println(result.length);
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i]+" ");
        }

    }
}
