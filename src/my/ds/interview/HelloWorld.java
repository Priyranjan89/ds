package my.ds.interview;

public class HelloWorld {
    int a = 1;

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        hw.a = 10;
        change(hw);
        System.out.println(hw.a);
    }

    public static void change(HelloWorld hw) {
        hw.a = 20;
        hw = null;
    }
}
