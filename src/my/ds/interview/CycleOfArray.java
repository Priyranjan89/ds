package my.ds.interview;

import java.util.HashSet;
import java.util.Set;

public class CycleOfArray {

    private static int countLengthOfCycle(int[] arr, int startIndex) {

        if (arr.length == 0){
            return -1;
        }
        int cycle =0;

        int index =0;
        Set<Integer> visitedIndex = new HashSet<>();

        for (int i = 0; i<arr.length; i++){
            if (i == 0) {
                index = arr[startIndex];
                visitedIndex.add(index);
                cycle++;
            }

            if(index > arr.length){
                return -1;
            }
            index = arr[index];
            if (visitedIndex.contains(index)){
                continue;
            } else {
                visitedIndex.add(index);
                cycle++;
            }

        }
        return cycle;
    }

    public static boolean doTestsPass() {

        boolean testsPassed = true;

        testsPassed &= countLengthOfCycle(new int[]{1, 0}, 0) == 2;
        testsPassed &= countLengthOfCycle(new int[]{1, 2, 0}, 0) == 3;

        testsPassed &= countLengthOfCycle(new int[]{1, 1}, 0) == 1;
        testsPassed &= countLengthOfCycle(new int[]{1, 3, 0, 1}, 0) == 2;
        testsPassed &= countLengthOfCycle(new int[]{7}, 0) == -1;
        testsPassed &= countLengthOfCycle(new int[]{1, 2, 4}, 0) == -1;

        if(testsPassed) {
            System.out.println( "Test passed." );
            return true;
        } else {
            System.out.println( "Test failed." );
            return false;
        }
    }


    public static void main( String[] args ) {
        doTestsPass();
    }
}
