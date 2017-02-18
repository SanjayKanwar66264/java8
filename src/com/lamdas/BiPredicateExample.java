package com.lamdas;

import java.util.function.BiPredicate;

/**
 * Created by sanjay kanwar on 9/01/2017.
 */
public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (x, y) -> x > y;
        System.out.println(biPredicate.test(4,5));
    }
}
