package com.lamdas;

import java.util.function.BiPredicate;

/**
 * Created by sanjay kanwar on 9/01/2017.
 */
public class BiPredicateExample2 {
    public static void main(String[] args) {
        System.out.println(compare((a, b) -> a >b, 10,5 ));
    }

    public static boolean compare(BiPredicate<Integer, Integer> biPredicate, Integer integer1, Integer integer2){
        return biPredicate.test(integer1, integer2);
    }

}
