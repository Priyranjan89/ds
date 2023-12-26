package my.ds.algoexpert.easy;

public class TwoNumberSum {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        for (int i = 0; i < array.length; i++) {
            for (int j =i+1; j< array.length; j++){
                if (array[i] + array[j] == targetSum){
                    int result[] = {array[i], array[j]};
                    return result;
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int num[] = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        int result[] = twoNumberSum(num, targetSum);
        System.out.print("[ ");
        for (int i =0; i< result.length; i++){
            System.out.print(result[i]);
        }
        System.out.print("]");

    }
}
