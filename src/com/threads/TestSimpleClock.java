package com.threads;

/**
 * Created by sanjay kanwar on 13/02/2017.
 */
public class TestSimpleClock{
    public static void main(String[] args) {
    SimpleClock simpleClock1 = new SimpleClock("Clock 1");
    SimpleClock simpleClock2 = new SimpleClock("Clock 2");
    simpleClock1.start();
    simpleClock2.start();
    }
}
