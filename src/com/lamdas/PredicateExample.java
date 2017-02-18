package com.lamdas;

import java.util.function.Predicate;

/**
 * Created by sanjay kanwar on 7/01/2017.
 */
public class PredicateExample {

    public static void main(String[] args) {
        Predicate<String> i = (s) -> s.length() > 5;
        System.out.println(i);
    }
}
