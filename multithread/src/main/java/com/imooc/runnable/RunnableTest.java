package main.java.com.imooc.runnable;

public class RunnableTest {
    public static void main(String[] args) {
        MyRunnable myRunnable=new MyRunnable();
        //把MyRunnable对象作为参数传入Thread类的构造函数的参数
        Thread thread=new Thread(myRunnable);
        thread.start();
        new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println("Anonymous function in progress"+i);
            }
        }).start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main in progress"+i);
        }
        //另一种写法：匿名函数

    }
}
