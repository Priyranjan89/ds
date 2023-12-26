package my.ds.letcode.essay.Arrays;

public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {

       /* int arr1[] = new int[n];
        int arr2[] = new int[n];

        for (int i = 0, j=0; i <nums.length; i++){
            if(i<n){
                arr1[i] = nums[i];
            }else {
                arr2[j] = nums[i];
                j++;
            }
        }

        for (int i=0, j=0, k=0; i < nums.length; i++){
           if(i%2!=0){
               nums[i] = arr2[j];
               j++;
           }else {
               nums[i] = arr1[k];
               k++;
           }
        }*/
        int result[] = new int[nums.length];
        for(int i=0, j=n, k=0; i<nums.length; i++){
            if(i%2!=0){
                result[i] = nums[j];
                j++;
            }else {
                result[i] = nums[k];
                k++;
            }
        }

        return result;
    }

    public static void main( String []arg){
        int inputArr[] = {1,2,3,4,5,6,7,8,9,10};
        int n = 5;
        ShuffleTheArray shuffleTheArray = new ShuffleTheArray();
        int result[] = shuffleTheArray.shuffle(inputArr, n);
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
