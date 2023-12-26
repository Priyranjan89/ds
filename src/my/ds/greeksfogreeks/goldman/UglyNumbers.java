package my.ds.greeksfogreeks.goldman;

public class UglyNumbers {

    static int maxDivide(int a, int b)
    {
        while (a % b == 0)
            a = a / b;
        return a;
    }

    /* Function to check if a number
    is ugly or not */
    static int isUgly(int no)
    {
        no = maxDivide(no, 2);
        no = maxDivide(no, 3);
        no = maxDivide(no, 5);

        return (no == 1) ? 1 : 0;
    }

    /* Function to get the nth ugly
    number*/
    static int getNthUglyNo(int n)
    {
        int i = 1;

        // ugly number count
        int count = 1;

        // check for all integers
        // until count becomes n
        while (n > count) {
            i++;
            if (isUgly(i) == 1)
                count++;
        }
        return i;
    }

    public static void main(String[] args) {
        int num = 150;
        int no = getNthUglyNo(num);

        System.out.println(num + " th ugly no. is " + no);

    }

    /*private static int getNthUglyNo(int num) {

        int i =1;
        int count = 1;

        while (num > count){
            i++;
            if (isUgly(i) == 0){
                count++;
            }
        }
        return i;
    }

    private static int isUgly(int no) {
        no = maxDivide(no,2);
        no = maxDivide(no,3);
        no = maxDivide(no,5);

        return (no == 1) ? 1 : 0;
    }

    public static int maxDivide(int a, int b) {

        while (a % b == 0)
            a = a / b;
        return a;

    }*/
}
