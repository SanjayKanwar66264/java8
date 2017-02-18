package com.lamdas;

import java.util.function.BiFunction;

/**
 * Created by sanjay kanwar on 9/01/2017.
 */
public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> {
            System.out.println(x*y);
            return (x * y);
        };

        biFunction.apply(4,5);

    }
}
