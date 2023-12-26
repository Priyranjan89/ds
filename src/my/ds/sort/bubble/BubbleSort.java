package my.ds.sort.bubble;

import static my.ds.sort.util.SortUtil.swap;

public class BubbleSort {

    public static void main(String[] xyz) {

        int array[] = {20, 35, -15, 7, 55, 1, -22, 5};

        for (int unSortIndex = array.length - 1; unSortIndex > 0; unSortIndex--) {

            for (int i = 0; i<unSortIndex; i++){
                if(array[i] > array[i+1]){
                    swap(array, i, i+1);
                }
            }
        }

        System.out.println("Sorted array");
        System.out.print("[");
        for (int i =0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.print("]");
    }

}
