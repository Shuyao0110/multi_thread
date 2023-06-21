package main.java.com.imooc.callable;

import java.util.Random;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        return new Random().nextInt();
    }
}

