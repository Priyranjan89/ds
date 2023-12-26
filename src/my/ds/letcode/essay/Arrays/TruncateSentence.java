package my.ds.letcode.essay.Arrays;

public class TruncateSentence {

    public static String truncateSentence(String s, int k) {

        /*String str[] = s.split("\\s+");
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            if (i == k){
                break;
            } else {
                string.append(str[i]).append(" ");
            }
        }
        string.deleteCharAt(string.length()-1);
        return string.toString();*/

        int indxCount = 0;
        int spaceCount = 0;
        String finalString;

        for (indxCount = 0; indxCount < s.length() && spaceCount < k; indxCount++) {
            if (s.charAt(indxCount) == ' ')
                spaceCount++;
        }

        if (spaceCount == k) {
            finalString = s.substring(0, indxCount - 1);
        } else {
            finalString = s;
        }

        return finalString;
    }

    public static void main(String[] args) {
        String s = "What is the solution to this problem";
        int k = 4;

        String str = truncateSentence(s, k);
        System.out.println(str);

    }
}
