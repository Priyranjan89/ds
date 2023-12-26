package my.ds.array.program;

import java.util.Scanner;

public class Tribonacci {

    public static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if ((n == 1) || (n == 2)) {
            return 1;
        }
        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter integer value: ");
        int input = scanner.nextInt();
        System.out.println(tribonacci(input));
    }
}
