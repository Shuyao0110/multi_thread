package main.java.com.imooc.runnable;

public class MyRunnable implements Runnable {
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("MyRunnable in progress"+i);
        }
    }
}
