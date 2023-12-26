package my.ds.interview;

public class SatudentMarksCalculation {


    static int student = 3;
    static int sub = 4;
    static int arr[][] = {{7, 9, 2, 5}, {9, 6, 7, 6}, {8, 9, 8, 9}};

    static int sum;
    static int skipCol = 0;
    static int result[] = new int[3];

    public static void traverseArray() {
        System.out.println("Printing the array now...");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void reverseArray() {
        int temp = Integer.MAX_VALUE;

        for (int col = 0; col < sub; col++) {
            sum = 0;
            for (int row = 0; row < student; row++) {
                sum = sum + arr[row][col];
            }
            System.out.println("One subject  total number for all students: "+sum);
            sum = sum / student;
            System.out.println("Once subject average for all students: "+sum);
            if (sum < temp) {
                temp = sum;
                skipCol = col;
            }
        }

        for (int i = 0; i < student; i++) {
            sum = 0;
            for (int j = 0; j<sub; j++){
                if(j == skipCol){
                    continue;
                }
               sum = sum+arr[i][j];
            }
            result[i] = sum;
        }
        System.out.println("\n");
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }

    }


    public static void main(String[] args) {
        traverseArray();
        reverseArray();
    }
}
