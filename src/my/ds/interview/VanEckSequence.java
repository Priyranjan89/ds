package my.ds.interview;

public class VanEckSequence {

    public static void main(String[] args) {
        int max = 100;
        int arr[] = new int[100];

        for (int i = 0; i < max-1; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < max-1; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] == arr[i]) {
                    arr[i + 1] = i - j;
                    break;
                }
            }
        }
        printArray(arr);
    }

    public static void printArray(int arr[]) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print(" ]");
    }
}
