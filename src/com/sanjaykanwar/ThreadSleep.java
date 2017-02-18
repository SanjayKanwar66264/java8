package com.sanjaykanwar;

/**
 * Created by sanjay kanwar on 5/01/2017.
 */
public class ThreadSleep {
    public static void main(String[] args) {
        System.out.println("Sleep for 5 milliseconds");
        try {
            Thread.sleep(5);
            System.out.println("Woke up after 5 milliseconds");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done after 5 milliseconds");
    }
}
