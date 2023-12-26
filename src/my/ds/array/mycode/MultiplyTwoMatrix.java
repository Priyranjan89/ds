package my.ds.array.mycode;

public class MultiplyTwoMatrix {

    int arr1[][];
    int arr2[][];
    int result[][];
    int value = 1;

    public MultiplyTwoMatrix(int row1, int col1, int row2, int col2){
        arr1 = new int[row1][col1];
        arr2 = new int[row2][col2];
        result = new int[row1][col2];

        for(int row = 0; row < arr1.length; row++){
            for (int col = 0; col < arr1[row].length; col++){
                arr1[row][col] = value;
                value++;
            }
        }

        for(int row = 0; row < arr2.length; row++){
            for (int col = 0; col < arr2[row].length; col++){
                arr2[row][col] = value;
                value++;
            }
        }
        value=0;
        for (int i=0; i<row1; i++){
            for (int j=0; j<col2; j++){
                for (int k=0; k<row2;k++){
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
    }

    public void traverseArray(){
        System.out.println("Print the array 1");
        for(int row = 0; row < arr1.length; row++){
            for (int col = 0; col < arr1[row].length; col++){
                System.out.print(arr1[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Print the array 2");
        for(int row = 0; row < arr2.length; row++){
            for (int col = 0; col < arr2[row].length; col++){
                System.out.print(arr2[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Print the result ");
        for(int row = 0; row < result.length; row++){
            for (int col = 0; col < result[row].length; col++){
                System.out.print(result[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
