package my.ds.letcode.essay.Arrays;

public class ComplementOfBaseInteger {

    public static int bitwiseComplement(int n) {
        /*String str = Integer.toBinaryString(n);

        StringBuilder sb = new StringBuilder();
        for (int i =0; i< str.length();i++){
            sb.append(str.charAt(i) == '0' ? '1' : '0');
        }
       return Integer.valueOf(sb.toString(),2);*/
        if(n == 0) return 1; // Checking for base case
        int res = 0;
        int fac = 1; // keep for 2 basically

        while(n != 0){
            // first we need to check what is our bit in 2 by taking modulo
            res += fac * (n % 2 == 0 ? 1 : 0);
            // res is the number convert back to decimal + factor * n % 2 if comes 0 then we take 1 otherwise 0 this is our complement

            fac *= 2;
            n /= 2;
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 2100;
        System.out.println(bitwiseComplement(n));
    }

    /*public static int bitwiseComplement(int n) {
        int rem=0;
        Stack<Integer> stack = new Stack();
        while (n >0){
            rem = n%2;
            stack.push(rem);
            n = n/2;
        }
        int size = stack.size();
        StringBuilder sb = new StringBuilder();
        for (int i =0; i<size;i++){
            rem = stack.pop();
            if(rem == 1){
                sb.append(0);
            } else if (rem == 0){
                sb.append(1);
            }
        }
        int value = Integer.valueOf(sb.toString());

        rem=0;
        int number = 0;
        while (value !=0){
            long reminder = value%10;
            value /=10;
            number += reminder*Math.pow(2,rem);
            ++rem;
        }

        return number;
    }

      public static int bitwiseComplement(int n) {
        long binary = 0;
        int count = 0;

        if (n == 0) {
            return 1;
        }

        while (n > 0) {
            long rem = n % 2;
            if (rem == 0) {
                rem = 1;
            } else {
                rem = 0;
            }
            binary += rem * Math.pow(10, count);
            n /= 2;
            count++;
        }

        count = 0;
        int number = 0;

        while (binary != 0) {
            long reminder = binary % 10;
            binary /= 10;
            number += reminder * Math.pow(2, count);
            ++count;
        }

        return number;
    }
    */
}
