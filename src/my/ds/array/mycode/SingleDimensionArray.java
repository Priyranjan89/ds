package my.ds.array.mycode;

public class SingleDimensionArray {

    int arr[] = null;

    public SingleDimensionArray( int sizeOfArray){
        arr = new int[sizeOfArray];
        for (int i = 0; i<arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void traverseArray(){
        try {
            for(int i = 0; i<arr.length; i++){
                System.out.println(arr[i] +"");
            }
        }catch (Exception e){
            System.out.println("Array no longer exist...");
        }
    }

    public void insertion(int location, int valueToBeInserted){
        try {
            if(arr[location] == Integer.MIN_VALUE){
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted "+valueToBeInserted+" location "+location);
            }else {
                System.out.println("This cell occupied by another value...");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array...");
        }
    }

    public void assessingCell(int cellNumber){
        try{
            System.out.println(arr[cellNumber]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array...");
        }
    }

    public void searchInAnArray(int valueToBeSearch){

        for(int i = 0; i<arr.length; i++){
            if (arr[i] == valueToBeSearch){
                System.out.println("Value found...!");
                System.out.println("Index of "+valueToBeSearch+ " is: "+i);
                return;
            }
        }
        System.out.println(valueToBeSearch+" is not found.");
    }

    public void deleteValueFromArray(int deleteValueFromCell){
        try{
           arr[deleteValueFromCell] = Integer.MIN_VALUE;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Can't delete the value as cell "+deleteValueFromCell+" provided value not in range of array...");
        }
    }
}
