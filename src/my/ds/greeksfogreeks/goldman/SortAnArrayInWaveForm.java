package my.ds.greeksfogreeks.goldman;

import java.util.Arrays;

public class SortAnArrayInWaveForm {

    public static void main(String[] args) {
        int arr[] = {3, 6, 5, 10, 7, 20};
        int n = arr.length;
        sortInWave(arr, n);
        for (int i : arr)
            System.out.print(i + " ");
    }

    private static void sortInWave(int[] arr, int n) {

        Arrays.sort(arr);
        for ( int i =0; i< n-1;i +=2){
            swap(arr, i, i+1);
        }
    }

    private static void swap(int []arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }


}
