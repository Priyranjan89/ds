package my.ds.interview;

public class CitiChalange2 {
    public static void main(String[] args) {
        String s = "abccbd";
        int []c = {0,1,2,3,4,5};
        System.out.println(solution(s,c));
    }

    public static int solution(String S, int[] C) {
        int total =0;
        int max = C[0];
        int cost = C[0];

        for( int i = 1; i<S.length(); i++){
            if(S.charAt(i) != S.charAt(i-1)){
                total += cost-max;
                cost = C[i];
                max = C[i];
            } else {
                cost += C[i];
                max = Math.max(max, C[i]);
            }
        }
        total += cost-max;
        return total;
    }
}
