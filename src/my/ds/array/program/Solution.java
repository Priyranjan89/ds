package my.ds.array.program;

import java.util.Scanner;

class Solution {
    public  static int fib(int n) {
        if(n < 1){
            throw new RuntimeException("Number is must be grater than or equal 1");
        }
        else if((n == 1) || (n == 2)){
            return n-1;
        }
        return fib(n-1) + fib(n-2) ;
    }

    public static void main( String []arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter integer value: ");
        int input = scanner.nextInt();
        System.out.println(fib(input));
    }
}
