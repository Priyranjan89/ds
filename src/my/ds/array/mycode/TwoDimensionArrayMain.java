package my.ds.array.mycode;

public class TwoDimensionArrayMain {

    public static void main(String[] args){
        int row = 5;
        int col = 5;
        int k = 1000;

        System.out.println("Creating two dimension blank array 5*5");
        TwoDimensionArray twoDimensionArray = new TwoDimensionArray(row, col);
        twoDimensionArray.traverseArray();

        System.out.println("Inserting value in Array");
        for (int i = 0; i<row; i++){
            for (int j = 0; j<col; j++){
                twoDimensionArray.insertTheValueInArray(i, j,k);
                k= k+100;
            }
        }
        System.out.println();
        twoDimensionArray.traverseArray();

        System.out.println("Accessing cell [2][3] value");
        twoDimensionArray.accessingSingleCell(2,3);

        System.out.println("Searching given value...");
        twoDimensionArray.searchingSingleValue(2700);
        twoDimensionArray.searchingSingleValue(270);

    }
}
