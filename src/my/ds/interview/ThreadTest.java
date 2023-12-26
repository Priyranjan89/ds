package my.ds.interview;

public class ThreadTest {

    public static void main(String[] args) {
        new MyThread().start();
        new MyThread(new MyRunneble()).start();
    }
}
