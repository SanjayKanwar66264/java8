package com.sanjaykanwar;

/**
 * Created by sanjay kanwar on 5/01/2017.
 */
public class Consumer extends Thread {
    private CubbyHoleThread cubbyHoleThread;
    private int number;

    public Consumer(CubbyHoleThread cubbyHoleThread, int number) {
        this.cubbyHoleThread = cubbyHoleThread;
        this.number = number;
    }

    public void run(){
        int value = 0;
        for(int i= 0; i < 10; i++){
            value = cubbyHoleThread.get();
            System.out.println("Consumer #" + this.number + " got: " + value);
        }
    }
}
