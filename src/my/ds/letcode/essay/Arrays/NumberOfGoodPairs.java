package my.ds.letcode.essay.Arrays;

public class NumberOfGoodPairs {

    public int numIdenticalPairs(int[] nums) {
        int result =0;

        for (int i =0; i < nums.length; i++){
            for (int j=0; j < nums.length; j++){
                if(nums[i] == nums[j] && i < j){
                    result++;
                }
            }
        }

        return result;
    }

    public static void main( String []arg){
        int inputArr[] = {1,2,3,1,1,3};

        NumberOfGoodPairs numberOfGoodPairs = new NumberOfGoodPairs();
        int result = numberOfGoodPairs.numIdenticalPairs(inputArr);
        System.out.println("Total number of Pairs :"+result);
    }
}
