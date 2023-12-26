package my.ds.greeksfogreeks.goldman;

public class ShortestPathInBinaryMaze {

    public static int findShortestPath(int mat[][], int source[], int destination[]) {
        int path = 0;

        for (int i = source[0]; i <= destination[1]; i++) {
            for (int j = source[1]; j <= destination[0]; j++) {
                if (mat[i][j] == 1) {
                    path++;
                }
                if ((i == destination[1]) && (j == destination[0])) {
                    if (mat[j][i] != 1) {
                        path = 0;
                    }
                }
            }
        }

        return path;
    }

    public static void main(String[] args) {

        int mat[][] = {{1, 0, 1, 1, 1, 1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1, 1, 1, 0, 1, 1},
                {1, 1, 1, 0, 1, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 1},
                {1, 1, 1, 0, 1, 1, 1, 0, 1, 0},
                {1, 0, 1, 1, 1, 1, 0, 1, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 1, 1, 0, 1, 1, 1},
                {1, 1, 0, 0, 0, 0, 1, 0, 0, 1}};


        int source[] = {0, 0};
        int destination[] = {8, 1};
        int result = findShortestPath(mat, source, destination);
        if (result == 0) {
            System.out.println("Shortest Path doesn't exist");
        } else {
            System.out.println("Shortest Path : " + result);
        }
    }
}
