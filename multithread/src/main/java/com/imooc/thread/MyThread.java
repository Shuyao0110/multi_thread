package main.java.com.imooc.thread;

/**
 *@author:Heidi
 *@description:
 */
//定义一个类继承Thread类
public class MyThread extends Thread{
    @Override
    //重写run方法
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("MyThread in progress");
        }
    }
}
