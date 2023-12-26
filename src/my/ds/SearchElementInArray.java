package my.ds;

public class SearchElementInArray {

    static int search(int arr[], int initial, int len, int key)
    {
        if (initial > len)
            return -1;

        int mid = (initial + len) / 2;
        if (arr[mid] == key)
            return mid;

        /* If arr[l...mid] first subarray is sorted */
        if (arr[initial] <= arr[mid]) {
            /* As this subarray is sorted, we
               can quickly check if key lies in
               half or other half */
            if (key >= arr[initial] && key <= arr[mid])
                return search(arr, initial, mid - 1, key);
            /*If key not lies in first half subarray,
           Divide other half  into two subarrays,
           such that we can quickly check if key lies
           in other half */
            return search(arr, mid + 1, len, key);
        }

        /* If arr[l..mid] first subarray is not sorted,
           then arr[mid... h] must be sorted subarray*/
        if (key >= arr[mid] && key <= arr[len])
            return search(arr, mid + 1, len, key);

        return search(arr, initial, mid - 1, key);
    }

    public static void main(String[] args) {
        int arr[] = {40, 41, 42, 43, 46, 47, 48, 30, 31};
        int traget = 42;
        int len = arr.length;

       int result = search(arr, 0, len, traget);
       if (result == -1 ){
           System.out.println("Value not found");
       } else {
           System.out.println("Value is found at index: "+result);
       }

    }
}
