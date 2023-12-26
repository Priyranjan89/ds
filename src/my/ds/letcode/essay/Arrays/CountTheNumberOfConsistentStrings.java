package my.ds.letcode.essay.Arrays;

import java.util.HashSet;
import java.util.Set;

public class CountTheNumberOfConsistentStrings {

    public static int countConsistentStrings(String allowed, String[] words) {
        int result =0;

        Set<Character> sets = new HashSet<>();
        for (int i = 0; i<allowed.length();i++){
            sets.add(allowed.charAt(i));
        }

        for(int i = 0; i<words.length; i++){
            boolean found = true;
            char ch[] = words[i].toCharArray();
            for (int j = 0; j<words[i].length();j++){
                if (!sets.contains(ch[j])){
                    found =false;
                    break;
                }
            }
            if (found){
                result++;
            }
        }

        return result;
    }


    public static void main(String[] args) {

        String allowed = "abc";
        String words[] = {"a","b","c","ab","ac","bc","abc"};

        int result = countConsistentStrings(allowed, words);
        System.out.println(result);
    }
}
