package my.ds.interview;

public class NumberChecker {

    public static void main(String[] args) {
        int[] numberArray = {1456,345671,43218,123};

        String result = findQualifiedNumbers(numberArray);

        System.out.println(result);
    }

    static String findQualifiedNumbers(int[] numberArray) {
        String result = "";

        String str1 = "123";
        String str2 = "321";

        for(int i =0; i<numberArray.length;i++){
            String st = String.valueOf(numberArray[i]);
            if (st.contains(str1) || st.contains(str2)){
                if(!result.isEmpty()){
                    result +=",";
                }
                result +=st;
            }

        }
        return result;
    }
}
