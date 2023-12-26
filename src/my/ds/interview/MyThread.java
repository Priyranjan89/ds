package my.ds.interview;

public class MyThread extends Thread {
   public MyThread(){};
    public MyThread(Runnable r){super(r);};

    @Override
    public void run() {
        System.out.println("Inside thread");
    }


}
