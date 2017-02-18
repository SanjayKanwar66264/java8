package com.sanjaykanwar;

/**
 * Created by sanjay kanwar on 4/01/2017.
 */
public class ProducerConsumerMain {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();
        Thread p = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++){
                    pc.produce();
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread c = new Thread(new Runnable() {
            @Override
            public void  run() {
                for(int i = 0; i < 10; i++){
                    pc.consumer();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        p.start();
        c.start();

    }
}
