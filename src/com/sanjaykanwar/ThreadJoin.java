package com.sanjaykanwar;

/**
 * Created by sanjay kanwar on 5/01/2017.
 */
public class ThreadJoin {
    public static void main(String[] args) {
        Thread thread = new Thread(ThreadJoin::print);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("DONE THREAD JOB");
    }

    public static void print(){
        for (int i = 0; i < 10; i++){
            System.out.println("Counter: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
