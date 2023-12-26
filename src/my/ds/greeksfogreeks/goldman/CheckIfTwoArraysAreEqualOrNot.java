package my.ds.greeksfogreeks.goldman;

import java.util.Arrays;

public class CheckIfTwoArraysAreEqualOrNot {
    public static void main(String[] args) {
        int arr1[] = {3, 5, 2, 5, 2};
        int arr2[] = {2, 3, 5, 5, 2};

        if (areEqual(arr1, arr2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    private static boolean areEqual(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }
       /* Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i =0; i<arr1.length; i++){
            if (arr1[i] != arr2[i]){
                return false;
            }
        }*/

        int a = arr1[0];
        int b = arr2[0];
        for (int i = 1; i < arr1.length; i++) {
            a ^= arr1[i];
        }

        for (int i = 1; i < arr2.length; i++) {
            b ^= arr2[i];
        }

        int all_XOR = a^b;

        if (all_XOR ==0){
            return true;
        }

        return false;
    }
}
