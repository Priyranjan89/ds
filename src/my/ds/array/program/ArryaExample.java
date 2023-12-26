package my.ds.array.program;



public class ArryaExample {

    public static void main(String[] args) {
       int arr[] = {1,2,3};
        //System.out.println(Math.abs(2-3));

       int total = 0;
       for (int i = arr.length-1; i>=0;i--){
           for(int j= 1;j<arr.length;j++){
               total += Math.abs(arr[i]-arr[j]);
           }
       }

        System.out.println(total);
    }
}
