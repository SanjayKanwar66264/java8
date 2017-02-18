package com.threads;

/**
 * Created by sanjay kanwar on 11/02/2017.
 */
public class RandomWaitTest {
    public static void main(String[] args) {
        RandomWait thread1 = new RandomWait("Alpha");
        RandomWait thread2 = new RandomWait("Beta");
        RandomWait thread3 = new RandomWait("Gamma");
        RandomWait thread4 = new RandomWait("Theta");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
