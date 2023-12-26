package my.ds.array.mycode;

public class MultiplyTwoMatrixMain {

    public static void main(String[] args){
        int row1 = 3;
        int col1 = 3;
        int row2 = 3;
        int col2 = 3;

        MultiplyTwoMatrix multiplyTwoMatrix = new MultiplyTwoMatrix(row1, col1, row2, col2);
        multiplyTwoMatrix.traverseArray();
    }
}
