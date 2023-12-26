package my.ds.hackerrank;

public class MinimumTimeNeedForCircleArray {
    public static void main(String[] args) {

        int arr[] = {6,14,4,1};

        int result = getMinimumTimeForCircleArray(arr);
        System.out.println(result);
    }

    public static int getMinimumTimeForCircleArray(int []arr){
        int total =0;

        for (int i =0; i<arr.length-1;i++){
            if (i==0){
                total += minimumTimeCircle(1,arr[i]);
            }
            total += minimumTimeCircle(arr[i], arr[i+1]);
        }
        return total;
    }
    public static int minimumTimeCircle(int start, int end){
        if(start<end){
            return Math.min(end - start, 15-end+start);
        } else {
            return  Math.min(start - end, 15-start+end);
        }
    }
}
