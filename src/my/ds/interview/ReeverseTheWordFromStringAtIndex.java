package my.ds.interview;

public class ReeverseTheWordFromStringAtIndex {

    public static String reverseWord(String str, int index){

        StringBuilder result = new StringBuilder();

        String strArr[] = str.split("\\s");

        if (index < 0 || index >= strArr.length){
            return "404";
        }

        StringBuilder rev = new StringBuilder(strArr[index]);
        rev.reverse();

        for (int i = 0; i<strArr.length; i++){
            if (i == index){
                result.append(rev).append(" ");
            } else {
                 result.append(strArr[i]).append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWord("hello world", 0));
        System.out.println(reverseWord("hey how are you", 2));
        System.out.println(reverseWord("hey how are you", 4));
    }
}
