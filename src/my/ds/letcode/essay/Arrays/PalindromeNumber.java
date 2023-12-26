package my.ds.letcode.essay.Arrays;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reverseNumber = 0;
        int num = x;
        while (x != 0) {
            int reminder = x % 10;
            reverseNumber = (reverseNumber * 10) + reminder;
            x /= 10;
        }

        if (num == reverseNumber) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
