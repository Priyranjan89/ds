package my.ds.array.mycode;

public class AddTwoMatrix {

    int arr1[][];
    int arr2[][];
    int result[][];
    int value = 1;

    public AddTwoMatrix(int numberOfRow, int numberOfColumns){
        arr1 = new int[numberOfRow][numberOfColumns];
        arr2 =  new int[numberOfRow][numberOfColumns];
        result =  new int[numberOfRow][numberOfColumns];

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

        for(int row = 0; row < result.length; row++){
            for (int col = 0; col < result[row].length; col++){
                result[row][col] = arr1[row][col]+arr2[row][col];
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

        System.out.println("Print the array 2");
        for(int row = 0; row < result.length; row++){
            for (int col = 0; col < result[row].length; col++){
                System.out.print(result[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
