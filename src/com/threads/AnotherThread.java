package com.threads;

import static com.threads.ThreadColor.ANSI_BLUE;

/**
 * Created by sanjay kanwar on 19/01/2017.
 */
public class AnotherThread extends Thread{
    @Override
    public void run(){
        System.out.println(ANSI_BLUE + "Hello from another thread");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "Another thread Woke me up");
        }
        System.out.println(ANSI_BLUE + "Four Seconds passed and anther thread woke me up");

    }
}
