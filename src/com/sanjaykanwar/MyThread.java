package com.sanjaykanwar;

/**
 * Created by sanjay kanwar on 4/01/2017.
 */
public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Hello Java thread");
    }

    MyThread myThread = new MyThread();
}
