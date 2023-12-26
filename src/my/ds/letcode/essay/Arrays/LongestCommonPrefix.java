package my.ds.letcode.essay.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        if (strs.length == 1) {
            if (strs[0].length() == 1) {
                sb.append(strs[0].charAt(0));
                return sb.toString();
            }
            return "";
        }
        for (int index = 0; index < strs[0].length(); index++) {

            char ch = strs[0].charAt(index);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() - 1 >= index ) {
                    if (ch != strs[j].charAt(index)) {
                        return sb.toString();
                    }
                } else {
                    return sb.toString();
                }
            }
            sb.append(ch);
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        String strs[] = {"flower", "flow", "flight"};
        String strs2[] = {"flower", "flower", "flower", "flower"};
        String strs1[] = {"a"};
        String strs3[] = {""};
        System.out.println(longestCommonPrefix(strs2));
    }
}
