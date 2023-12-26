package my.ds.array.program;

public class Factorial {

    public static void main(String []args){

        System.out.println(factor(5));
    }

    static long factor(int number){

        if(number <=0 )
            return 1;
        else
            return number * factor(number-1);
    }
}
