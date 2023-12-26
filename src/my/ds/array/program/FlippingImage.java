package my.ds.array.program;

import java.util.Arrays;
import java.util.Scanner;

public class FlippingImage {

    static Scanner scanner = new Scanner(System.in);

    public static int[][] flipAndInvertImage(int[][] a) {

        int m = a.length;
        int n = a[0].length;

        int b[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = a[i][n-1-j];

                int t = b[i][j];
                if(t == 0){
                    t = 1;
                } else {
                    t = 0;
                }
                b[i][j] = t;
            }
        }
        return b;
    }

    public static void main(String[] arg) {

        System.out.println("Please enter number of row and columns for 2d array: ");
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        int a[][] = new int[row][column];
        System.out.println("Please enter array elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                int value = scanner.nextInt();
                a[i][j] = value;
            }
        }
        System.out.println(Arrays.deepToString(a));
        int[][] result = flipAndInvertImage(a);

        System.out.println(Arrays.deepToString(result));
    }
}
