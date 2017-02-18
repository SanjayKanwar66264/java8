package com.sanjaykanwar;

/**
 * Created by sanjay kanwar on 5/01/2017.
 */
public class Producer extends Thread {
    private CubbyHoleThread cubbyHoleThread;
    private int number;

    public Producer(CubbyHoleThread cubbyHoleThread, int number) {
        this.cubbyHoleThread = cubbyHoleThread;
        this.number = number;
    }


    public void run(){
        for(int i = 0; i < 10; i++){
            cubbyHoleThread.put(i);
            System.out.println("Producer #" + this.number + " put: " + i);
            try{
                sleep((int)(Math.random() * 100));
            }
            catch (InterruptedException e){

            }

        }
    }
}
