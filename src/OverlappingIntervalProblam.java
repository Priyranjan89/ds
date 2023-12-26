import java.util.ArrayList;
import java.util.List;

/*
* int arr[][] = {{1,3}, {2,6}, {8,10}, {12,16},{15,18}};

1  3
2  6
8  10
12 16
15 18
22,25
* */

public class OverlappingIntervalProblam {

    public static List<List<Integer>> getOverlapInterval(int arr[][]){

        List<List<Integer>> outerList = new ArrayList<>();

        for (int i =0; i<arr.length; i++){
            if ((i < arr.length-1) && (arr[i+1][0] < arr[i][1])){
                List<Integer> innerList = new ArrayList<>();
                innerList.add(arr[i][0]);
                innerList.add(arr[i+1][1]);
                outerList.add(innerList);
                i++;

            } else {
                List<Integer> innerList2 = new ArrayList<>();
                innerList2.add(arr[i][0]);
                innerList2.add(arr[i][1]);
                outerList.add(innerList2);
            }

        }
        return outerList;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,3}, {2,6}, {8,10}, {12,16}, {15,18}, {22,25}};

        List<List<Integer>> result = getOverlapInterval(arr);
        result.stream().forEach(System.out::println);
    }
}
