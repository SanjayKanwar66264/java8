package com.threads;

import static com.threads.ThreadColor.ANSI_RED;

/**
 * Created by sanjay kanwar on 19/01/2017.
 */
public class MyRunnable implements  Runnable{

    public void run(){
        System.out.println(ANSI_RED + "HELLO FROM MY RUNNABLE IMPLEMENTS RUNNABLE");
    }
}
