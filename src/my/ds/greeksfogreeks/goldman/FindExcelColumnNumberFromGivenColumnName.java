package my.ds.greeksfogreeks.goldman;

public class FindExcelColumnNumberFromGivenColumnName {

    public static int getExcelColumnNumber(String str){
        int result =0;

        for (int i = 0; i<str.length();i++){
            result *=26;
            result += str.charAt(i) - 'A'+1;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(getExcelColumnNumber("Z"));
        System.out.println(getExcelColumnNumber("AY"));
        System.out.println(getExcelColumnNumber("AZ"));
        System.out.println(getExcelColumnNumber("CB"));
        System.out.println(getExcelColumnNumber("YZ"));
        System.out.println(getExcelColumnNumber("ZZ"));
        System.out.println(getExcelColumnNumber("AAC"));
    }
}
