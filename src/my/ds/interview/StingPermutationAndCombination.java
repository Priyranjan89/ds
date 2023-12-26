package my.ds.interview;


public class StingPermutationAndCombination {

    public static void main(String[] args) {

        String str = "abc";
        printPermutn(str, "");

    }

    public static void printPermutn(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String res = str.substring(0, i) + str.substring(i + 1);
            printPermutn(res, ans+ch);
        }
    }

}









       /* char []ch = str.toCharArray();
        List<String> list = new ArrayList<>();

        for(int i = 0; i<str.length();i++){
            String s = null;
            for(int j =0; j<str.length();j++){
                if(ch[i] == ch[j]){
                    continue;
                } else {

                }

            }
        }*/

