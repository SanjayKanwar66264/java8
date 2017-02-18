package com.threads;

/**
 * Created by sanjay kanwar on 11/02/2017.
 */
public class RandomWait extends  Thread{

    public RandomWait(String name){
        super(name);
    }

    public void run(){
        System.out.println("started threadt at " + getName());
        for(int count = 0; count < 5; count++){
            System.out.println(getName() + " executing loop: " + count);
            try {
                int waittime = (int) (Math.random() * 1450 + Math.random() * 1730);
                sleep(waittime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Completed executing thread" + getName());
    }
}
