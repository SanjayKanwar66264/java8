package com.threads;

import static com.threads.ThreadColor.ANSI_BLACK;
import static com.threads.ThreadColor.ANSI_GREEN;

/**
 * Created by sanjay kanwar on 19/01/2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_GREEN + "Main thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();
        anotherThread.interrupt();
        System.out.println(ANSI_GREEN + "Hello Again from Main Thread");
    }
}
