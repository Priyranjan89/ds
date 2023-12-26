package my.ds.letcode.essay.Arrays;

public class ConvertBinaryToDecimal {

    public static int convertBinaryToDecimal(long num){
        int number =0;
        int i =0;

        while (num !=0){
            long reminder = num%10;
            num /=10;
            number += reminder*Math.pow(2,i);
            ++i;
        }

        return number;
    }

    public static void main(String[] args) {
        System.out.println(convertBinaryToDecimal(1000));
    }
}
