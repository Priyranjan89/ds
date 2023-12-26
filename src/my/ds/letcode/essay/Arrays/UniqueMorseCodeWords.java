package my.ds.letcode.essay.Arrays;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {

    public static int uniqueMorseRepresentations(String[] words) {
       String mapping[] = {".-","-...","-.-.","-..",".","..-.",
               "--.","....","..",".---","-.-",".-..","--","-.",
               "---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> sets = new HashSet<>();

        for (String word : words){
            String s = new String();
            for (char c : word.toCharArray()){
                s = s+mapping[c -'a'];
            }
            sets.add(s);
        }

        return sets.size();
    }

    public static void main(String[] args) {
        String []words = {"gin","zen","gig","msg"};
        String []words1 = {"a"};
        System.out.println(uniqueMorseRepresentations(words));
        System.out.println(uniqueMorseRepresentations(words1));
    }
}
