package com.sanjaykanwar;

/**
 * Created by sanjay kanwar on 5/01/2017.
 */
public class ThreadPriority {
    public static void main(String[] args) {
        boolean b;
        Boolean c = null;
        System.out.println("BOOLEAN" + c);
        Thread t = Thread.currentThread();//from   ww w  .j  a  v  a  2 s  . c o  m
        System.out.println("main Thread  Priority:" + t.getPriority());

        Thread t1 = new Thread();
        System.out.println("Thread(t1) Priority:" + t1.getPriority());

        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println("main Thread  Priority:" + t.getPriority());

        Thread t2 = new Thread();
        System.out.println("Thread(t2) Priority:" + t2.getPriority());

        // Change thread t2 priority to minimum
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Thread(t2) Priority:" + t2.getPriority());
    }
}
