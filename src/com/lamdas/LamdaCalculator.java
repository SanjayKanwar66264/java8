package com.lamdas;

/**
 * Created by sanjay kanwar on 6/01/2017.
 */
public class LamdaCalculator {
    public static void main(String[] args) {
        engine((x, y) -> x + y);
    }

    public static void engine(Calculator calculator){
        int x= 2; int y = 3;
        int result = calculator.calculate(x, y);
        System.out.println(result);
    }
}

@FunctionalInterface
interface Calculator{
    int calculate( int x, int y);
}