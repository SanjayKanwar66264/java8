package com.sanjaykanwar;

import java.util.Random;

/**
 * Created by sanjay kanwar on 4/01/2017.
 */
public class ProducerConsumer {
    Random random = new Random();
    boolean isProduced = false;
    int theValue;

    public synchronized void produce(){
        if(isProduced){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        theValue = random.nextInt(10);
        System.out.println("Produced: "+ theValue);
        isProduced = true;
        this.notify();
    }

    public synchronized void consumer(){
        if(!isProduced){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: "+ theValue);
        isProduced = false;
        this.notify();
    }
}
