package my.ds.greeksfogreeks.goldman;

import java.util.ArrayList;

public class ReverseWordsGivenString {

    public static String reverseStringInWord(String str) {

        StringBuilder sb = new StringBuilder();
        StringBuilder word = new StringBuilder();
        ArrayList<String> arrayList = new ArrayList<>();

        char ch[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (ch[i] == ' ') {
                arrayList.add(word.toString());
                word.setLength(0);
            } else if (i == str.length() - 1) {
                word.append(ch[i]);
                arrayList.add(word.toString());
            } else {
                word.append(ch[i]);
            }
        }

        for (int i = arrayList.size() - 1; i >= 0; i--) {
            if (i == 0) {
                sb.append(arrayList.get(i));
            } else {
                sb.append(arrayList.get(i)).append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "i like this program very much";
        System.out.println(reverseStringInWord(str));

      /* StringBuilder sb = new StringBuilder();
       sb.append("abc");
        System.out.println(sb.toString());
        sb.setLength(0);

        System.out.println(sb.toString());*/
    }
}
