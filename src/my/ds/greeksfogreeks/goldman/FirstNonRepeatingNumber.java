package my.ds.greeksfogreeks.goldman;

public class FirstNonRepeatingNumber {

    public static int firstNonRepeating(int []num){
        int len = num.length;
        for (int i = 0; i<len; i++){
            int j ;
            for (j =0; j<len;j++){
                if (i != j && (num[i]== num[j])){
                    break;
                }
                if (j == len-1){
                    return num[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = {9, 4, 9, 6, 7, 4 };
        System.out.println(firstNonRepeating(num));
    }
}
