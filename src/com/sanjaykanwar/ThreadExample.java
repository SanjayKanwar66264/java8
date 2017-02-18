package com.sanjaykanwar;

/**
 * Created by sanjay kanwar on 5/01/2017.
 */
public class ThreadExample {
    public static int myValue = 1;

    public static void main(String[] args){
            Thread thread = new Thread(() -> {
                while (true){
                    updateBalance();
                }
            });
            thread.start();
            thread = new Thread(()->{
                while (true){
                    monitorBalance();
                }
            });
            thread.start();
    }

    public static synchronized void updateBalance(){
        System.out.println("start: " + myValue);
        myValue = myValue +1;
        myValue = myValue - 1;
        System.out.println("end: " + myValue);
    }

    public static synchronized void monitorBalance(){
        int b = myValue;
        if( b!= 1){
            System.out.println("Balance changed: " + b);
            System.exit(1);
        }
    }
}
