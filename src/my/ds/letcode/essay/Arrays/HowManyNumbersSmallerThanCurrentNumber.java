package my.ds.letcode.essay.Arrays;

public class HowManyNumbersSmallerThanCurrentNumber {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int result[] = new int[nums.length];

        for (int i =0; i < nums.length; i++){
            int smallerNumber = 0;
            for (int j=0; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    smallerNumber++;
                }
            }
            result[i] = smallerNumber;
        }

        return result;
    }

    public static void main( String []arg){
        int inputArr[] = {8,1,2,2,3};
        HowManyNumbersSmallerThanCurrentNumber smallerThanCurrentNumber = new HowManyNumbersSmallerThanCurrentNumber();
        int result[] = smallerThanCurrentNumber.smallerNumbersThanCurrent(inputArr);

        for (int i = 0; i < result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
