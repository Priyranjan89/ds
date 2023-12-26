package my.ds.letcode.essay.Arrays;

public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {

        int arr[] = new int[nums.length*2];

        for (int i = 0, j=0; i<arr.length; i++,j++ ){
            if(i == nums.length){
                j =0;
            }
            arr[i] = nums[j];

        }
        return arr;
    }

    public static void main( String []arg){
        int inputArr[] = {1,3,8,4,2};
        ConcatenationOfArray concatenation = new ConcatenationOfArray();
       int result[] = concatenation.getConcatenation(inputArr);
        System.out.println(result.length);
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i]+" ");
        }

    }
}
