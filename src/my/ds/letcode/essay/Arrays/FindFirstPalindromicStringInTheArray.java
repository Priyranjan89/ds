package my.ds.letcode.essay.Arrays;

public class FindFirstPalindromicStringInTheArray {

    public static String firstPalindrome(String[] words) {
        String result = "";

        for (int i =0; i < words.length; i++){
            StringBuilder str = new StringBuilder(words[i]);
            if (words[i].equals(str.reverse().toString())){
                result +=words[i];
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String words[] = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));
    }
}
