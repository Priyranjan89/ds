package my.ds.greeksfogreeks.goldman;

public class ReverseWordsInAGivenString {

    public static String reverseStringByWord(String s){

        String arr[] = s.split("\\.");

        StringBuilder sb = new StringBuilder();
        for (int i = arr.length-1; i>=0; i--){
            if ( i ==0){
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(".");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s ="i.like.this.program.very.much";
        System.out.println(reverseStringByWord(s));
    }
}
