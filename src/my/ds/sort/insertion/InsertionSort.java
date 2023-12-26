package my.ds.sort.insertion;

public class InsertionSort {
    public static void main(String[] args) {

        int array[] = {20, 35, -15, 7, 55, 1, -22, 5};

        for (int firstUnSortIndex = 1; firstUnSortIndex < array.length; firstUnSortIndex++) {
            int newElement = array[firstUnSortIndex];

            int i;
            for (i = firstUnSortIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }

        System.out.println("Sorted array");
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");

    }
}
