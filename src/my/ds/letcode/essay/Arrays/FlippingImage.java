package my.ds.letcode.essay.Arrays;

import java.util.Arrays;

public class FlippingImage {

    public static int[][] flipAndInvertImage(int[][] image) {

        int m = image.length;
        int n = image[0].length;

        int b[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int k = n - 1, j = 0; k >= 0; j++, k--) {
                b[i][j] = image[i][k];

                int t = b[i][j];
                if (t == 0) {
                    t = 1;
                } else {
                    t = 0;
                }
                b[i][j] = t;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int a[][] = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        int[][] result = flipAndInvertImage(a);

        System.out.println(Arrays.deepToString(result));
    }
}
