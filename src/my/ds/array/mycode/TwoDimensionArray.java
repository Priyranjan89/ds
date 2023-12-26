package my.ds.array.mycode;

public class TwoDimensionArray {

    int arr[][];

    public TwoDimensionArray(int numberOfRow, int numberOfColumns) {
        this.arr = new int[numberOfRow][numberOfColumns];
        for(int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    public void traverseArray(){
        try {
            System.out.println("Printing the array now...");
            for(int row = 0; row < arr.length; row++){
                for (int col = 0; col < arr[row].length; col++){
                    System.out.print(arr[row][col]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }catch (Exception e){
            System.out.println("Invalid index to access array...");
        }
    }

    public void insertTheValueInArray(int row, int col, int value){
        try {
            if(arr[row][col] == Integer.MIN_VALUE){
                arr[row][col] = value;
                System.out.println("Successfully inserted the Value "+value+" in the Array...");
            }else {
                System.out.println("This cell is already occupied by another value");
            }
        }catch (Exception e){
            System.out.println("Invalid index to access array...");
        }
    }

    public void accessingSingleCell(int row, int col){
        try {
            System.out.println("Cell value is: "+arr[row][col]);
        }catch (Exception e){
            System.out.println("Invalid index to access array...");
        }
    }

    public void searchingSingleValue(int value){
        System.out.println("Searching value "+value+" in the Array...");
        for(int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == value){
                    System.out.println("Value is found at location row "+row+" column "+col);
                    return;
                }
            }
        }
        System.out.println("Value not found in array...");
    }
}
