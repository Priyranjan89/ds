package my.ds.greeksfogreeks.goldman;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

public class LargestNumberFormedFromAnArray {

    public static void main(String[] args) {
        Vector<String> arr = new Vector<>();

        // input is 60 548 546 54 output should be 6054854654
        arr.add("54");
        arr.add("546");
        arr.add("548");
        arr.add("60");
        arr.add("70");
        arr.add("780");
        printLargest(arr);
    }

    private static void printLargest(Vector<String> arr) {

        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (a+b).compareTo(b+a) > 0 ? -1 : 1;
            }
        });
        arr.forEach(System.out::print);
    }

    String printLargest(String[] arr) {
        Vector<String> var = new Vector<>();
        for(int i=0; i<arr.length; i++){
            var.add(arr[i]);
        }

        Collections.sort(var, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (a+b).compareTo(b+a) > 0 ? -1 : 1;
            }
        });
        StringBuilder sb = new StringBuilder();
        Iterator iterator = var.iterator();
        while (iterator.hasNext()){
            sb.append(iterator.next());
        }
        return sb.toString();
    }
}
