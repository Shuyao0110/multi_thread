package main.java.com.imooc.callable;

import java.util.concurrent.*;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        MyCallable myCallable=new MyCallable();
        //中间类FutureTask实现了RunnableFuture的接口
        //RunnableFuture是Runnable的子类
        FutureTask<Integer> futureTask=new FutureTask<Integer>(myCallable);
        Thread thread = new Thread(futureTask);
        thread.start();
        Integer integer =futureTask.get(3, TimeUnit.SECONDS);
        System.out.println(integer);
    }
}
