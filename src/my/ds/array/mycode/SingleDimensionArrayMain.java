package my.ds.array.mycode;

public class SingleDimensionArrayMain {
    public static void main(String[] args){

        System.out.println("Creating a blank array of size is 10...");
        SingleDimensionArray singleDimensionArray = new SingleDimensionArray(10);
        System.out.println();
        singleDimensionArray.traverseArray();
        System.out.println();

        System.out.println("Inserting few values in the array...");
        singleDimensionArray.insertion(0,10);
        singleDimensionArray.insertion(1,20);
        singleDimensionArray.insertion(2,30);
        singleDimensionArray.insertion(3,40);
        singleDimensionArray.insertion(4,50);
        singleDimensionArray.insertion(5,60);
        singleDimensionArray.insertion(6,70);
        singleDimensionArray.insertion(7,80);
        singleDimensionArray.insertion(8,90);

        System.out.println();
        singleDimensionArray.insertion(0,90);
        singleDimensionArray.insertion(12,400);
        System.out.println();

        System.out.println("Accessing cell number 3");
        singleDimensionArray.assessingCell(3);
        System.out.println();System.out.println();

        System.out.println("Searching 70 in the array...");
        singleDimensionArray.searchInAnArray(70);
        System.out.println("Searching 200 in the array...");
        singleDimensionArray.searchInAnArray(200);
        System.out.println();System.out.println();

        System.out.println("Deleting value from cell 4 of array...");
        System.out.println("Before deleting");
        singleDimensionArray.traverseArray();
        singleDimensionArray.deleteValueFromArray(3);
        System.out.println("After deleted");
        singleDimensionArray.traverseArray();
        singleDimensionArray.deleteValueFromArray(15);
    }
}
