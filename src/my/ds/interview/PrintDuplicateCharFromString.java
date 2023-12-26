package my.ds.interview;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateCharFromString {

    public static void main(String[] args) {
        String str = "abcbedefc";
        char[] chr = str.toCharArray();
        System.out.println("The string is:" + str);
        System.out.print("Duplicate Characters in above string are: ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (chr[i] == chr[j]) {
                    System.out.print(chr[j]+" ");
                    break;
                }
            }
        }

        Set setDuplicate = new HashSet();
        Set distinctChars = new HashSet();

        for (char ch : chr){
            if (distinctChars.add(ch) == false){
                setDuplicate.add(ch);
            }
        }
        System.out.println("\n");
        System.out.println("Print duplicate character"+ setDuplicate);
       // System.out.println(setDuplicate);




    }
}
