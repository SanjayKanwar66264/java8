package com.threads;

import java.util.Calendar;

/**
 * Created by sanjay kanwar on 13/02/2017.
 */
public class SimpleClock extends Thread {

    private Calendar calendar = Calendar.getInstance();

    public SimpleClock(String name){
        super(name);
    }
    public void run(){
        System.out.println("Simple clock started");

        calendar= Calendar.getInstance();
        int currSeconds = calendar.get(Calendar.SECOND);
        int waitSeconds = 5 - currSeconds % 5;
        if(waitSeconds > 0){
            try {
                sleep(waitSeconds*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for(int count = 0; count < 12; count++){
            calendar = calendar.getInstance();
            System.out.println(calendar.get(Calendar.HOUR_OF_DAY) + " " + calendar.get(Calendar.MINUTE) + " " + calendar.get(Calendar.SECOND));
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
