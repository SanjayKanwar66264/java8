package com.sanjaykanwar;

/**
 * Created by sanjay kanwar on 5/01/2017.
 */
public class CubbyHoleThread {
    private int contents;
    private boolean available = false;

    public static void main(String[] args) {
        CubbyHoleThread cubbyHoleThread = new CubbyHoleThread();
        Producer producer = new Producer(cubbyHoleThread, 1);
        Consumer consumer = new Consumer(cubbyHoleThread, 1);
        producer.start();
        consumer.start();


    }

    public synchronized int get(){
        while (!available){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        notifyAll();
        return contents;
    }

    public synchronized void put(int value){
        while (available){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        contents = value;
        available = true;
        notifyAll();
    }


}
