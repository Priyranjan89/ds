package my.ds.hackerrank;

public class MinimumTimeNeededToPrintString {

    public static void main(String[] args) {
        long result = getTime("BZA");

        System.out.println(result);

    }

    public static long getTime(String s) {

        long total = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length() - 1; i++) {

            if (i == 0) {
                total += distance('A', ch[i]);
            }
            total += distance(ch[i], ch[i + 1]);
        }
        return total;
    }


    static int distance(char start, char end) {
        if (start < end)
            return Math.min(end - start, 26 - end + start);
        else
            return Math.min(start - end, 26 - start + end);
    }
}
