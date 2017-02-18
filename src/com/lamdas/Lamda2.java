package com.lamdas;

/**
 * Created by sanjay kanwar on 6/01/2017.
 */
public class Lamda2 {
    public static void main(String[] args) {
            engine((x,y) -> x + y );
    }

    public static void engine(Calculate c){
        long x = 2;
        long y = 4;
        System.out.println(c.calculate(x, y));

    }

}

@FunctionalInterface
interface Calculate{
    long calculate(long x, long y);
}