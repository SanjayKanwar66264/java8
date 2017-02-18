package com.sanjaykanwar;


public class Main{
    public static void main(String[] argv) {
//        ThreadDemo threadDemo =/* new ThreadDemo();
//        threadDemo.start();
//
//        ThreadDemo threadDemo1 = new ThreadDemo();
//        threadDemo1.start();*/

        Thread t1 = new Thread(new RunnableClass());
        Thread t2 = new Thread(new RunnableClass());
        t1.start();
        t2.start();


    }

    public static void print() {
    }
}

class RunnableClass implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getId() + " " +i);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}