package my.ds.greeksfogreeks.goldman;

public class FindExcelColumnNameFromGivenColumnNumber {

    private static void printString(int colNum) {

        StringBuilder sb = new StringBuilder();

        while (colNum > 0){

            int rem = colNum%26;

            if (rem == 0){
                sb.append("Z");
                colNum = (colNum/26)-1;
            } else {
                sb.append((char)((rem-1)+'A'));
                colNum = colNum/26;
            }
        }

        System.out.println(sb.reverse());
    }

    public static void main(String[] args) {
        printString(28);
        printString(51);
        printString(52);
        printString(80);
        printString(676);
        printString(702);
        printString(705);


    }

}
