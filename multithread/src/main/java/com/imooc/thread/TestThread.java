package main.java.com.imooc.thread;

public class TestThread {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        //启动一个线程是start()不是run()
        myThread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(("main thread in progress"+i));
        }
    }
}
