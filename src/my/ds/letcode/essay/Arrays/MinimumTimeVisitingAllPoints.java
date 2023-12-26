package my.ds.letcode.essay.Arrays;

public class MinimumTimeVisitingAllPoints {

    public static int minTimeToVisitAllPoints(int[][] points) {
        int move = 0;
        for (int i=1; i<points.length; i++) {
            int a = Math.abs(points[i][0] - points[i-1][0]);
            int b = Math.abs(points[i][1] - points[i-1][1]);
            move += Math.max(a, b);
        }
        return move;
    }

    public static void main(String[] args) {
        int point[][] = {{1,1},{3,4},{-1,0}};
        System.out.println(minTimeToVisitAllPoints(point));
    }
}
